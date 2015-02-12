package com.panfilov.unityscript.psi;

import com.intellij.psi.tree.IElementType;
import com.panfilov.unityscript.UnityScriptLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class UnityScriptTokenType extends IElementType {
    public UnityScriptTokenType(@NotNull @NonNls String debugName) {
        super(debugName, UnityScriptLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "UnityScriptTokenType." + super.toString();
    }
}