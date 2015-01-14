package com.unityscript;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class UnityScriptFileType extends LanguageFileType  {
    public static final UnityScriptFileType INSTANCE = new UnityScriptFileType();

    private UnityScriptFileType() {
        super(UnityScriptLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "UnityScript";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "UnityScript (Unity3d) file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "ujs";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return UnityScriptIcons.FILE;
    }
}
