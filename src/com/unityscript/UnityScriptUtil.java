package com.unityscript;


import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.indexing.FileBasedIndex;
import com.unityscript.psi.UnityScriptFile;
import com.unityscript.psi.UnityScriptProperty;
import com.unityscript.psi.impl.UnityScriptPsiImplUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UnityScriptUtil {
    public static List<UnityScriptProperty> findProperties(Project project, String key) {
        List<UnityScriptProperty> result = null;
        Collection<VirtualFile> virtualFiles = FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, UnityScriptFileType.INSTANCE,
                GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            UnityScriptFile UnityScriptFile = (UnityScriptFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (UnityScriptFile != null) {
                UnityScriptProperty[] properties = PsiTreeUtil.getChildrenOfType(UnityScriptFile, UnityScriptProperty.class);
                if (properties != null) {
                    for (UnityScriptProperty property : properties) {
                        if(key.equals(UnityScriptPsiImplUtil.getKey(property))) {
                            if (result == null) {
                                result = new ArrayList<UnityScriptProperty>();
                            }
                            result.add(property);
                        }
                    }
                }
            }
        }
        return result != null ? result : Collections.<UnityScriptProperty>emptyList();
    }

    public static List<UnityScriptProperty> findProperties(Project project) {
        List<UnityScriptProperty> result = new ArrayList<UnityScriptProperty>();
        Collection<VirtualFile> virtualFiles = FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, UnityScriptFileType.INSTANCE,
                GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            UnityScriptFile UnityScriptFile = (UnityScriptFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (UnityScriptFile != null) {
                UnityScriptProperty[] properties = PsiTreeUtil.getChildrenOfType(UnityScriptFile, UnityScriptProperty.class);
                if (properties != null) {
                    Collections.addAll(result, properties);
                }
            }
        }
        return result;
    }
}