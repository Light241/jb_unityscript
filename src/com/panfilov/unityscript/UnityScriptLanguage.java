package com.panfilov.unityscript;

import com.intellij.lang.Language;

public class UnityScriptLanguage extends Language {

    public static final UnityScriptLanguage INSTANCE = new UnityScriptLanguage();

    private UnityScriptLanguage() {
        super("UnityScript");
    }
}
