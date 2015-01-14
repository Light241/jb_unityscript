package com.unityscript.psi.impl;

import com.intellij.lang.ASTNode;
import com.unityscript.psi.UnityScriptProperty;
import com.unityscript.psi.UnityScriptTypes;

public class UnityScriptPsiImplUtil {
    public static String getKey(UnityScriptProperty element) {
        ASTNode keyNode = element.getNode().findChildByType(UnityScriptTypes.KEY);
        if (keyNode != null) {
            return keyNode.getText();
        } else {
            return null;
        }
    }

    public static String getValue(UnityScriptProperty element) {
        ASTNode valueNode = element.getNode().findChildByType(UnityScriptTypes.VALUE);
        if (valueNode != null) {
            return valueNode.getText();
        } else {
            return null;
        }
    }
}