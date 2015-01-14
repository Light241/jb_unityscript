package com.unityscript.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.unityscript.UnityScriptFileType;
import com.unityscript.UnityScriptLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class UnityScriptFile extends PsiFileBase {
    public UnityScriptFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, UnityScriptLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return UnityScriptFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "UnityScript File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}