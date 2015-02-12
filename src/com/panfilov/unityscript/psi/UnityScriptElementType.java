
package com.panfilov.unityscript.psi;

import com.intellij.psi.tree.IElementType;
import com.panfilov.unityscript.UnityScriptLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class UnityScriptElementType extends IElementType {
    public UnityScriptElementType(@NotNull @NonNls String debugName) {
        super(debugName, UnityScriptLanguage.INSTANCE);
    }
}