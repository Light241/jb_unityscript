package com.unityscript;

import com.intellij.codeInsight.daemon.RelatedItemLineMarkerInfo;
import com.intellij.codeInsight.daemon.RelatedItemLineMarkerProvider;
import com.intellij.codeInsight.navigation.NavigationGutterIconBuilder;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiLiteralExpression;
import com.unityscript.psi.UnityScriptProperty;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.List;

public class UnityScriptLineMarkerProvider extends RelatedItemLineMarkerProvider {
    @Override
    protected void collectNavigationMarkers(@NotNull PsiElement element, Collection<? super RelatedItemLineMarkerInfo> result) {
        if (element instanceof PsiLiteralExpression) {
            PsiLiteralExpression literalExpression = (PsiLiteralExpression) element;
            String value = (String) literalExpression.getValue();
            //todo remove
            if (value != null && value.startsWith("demo_plugin_val:")) {
                Project project = element.getProject();
                final List<UnityScriptProperty> properties = UnityScriptUtil.findProperties(project, value.substring(7));
                if (properties.size() > 0) {
                    NavigationGutterIconBuilder<PsiElement> builder =
                            NavigationGutterIconBuilder.create(UnityScriptIcons.FILE).
                                    setTargets(properties).
                                    setTooltipText("Navigate to a UnityScript property");
                    result.add(builder.createLineMarkerInfo(element));
                }
            }
        }
    }
}