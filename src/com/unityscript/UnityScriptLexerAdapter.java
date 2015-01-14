package com.unityscript;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class UnityScriptLexerAdapter extends FlexAdapter {
    public UnityScriptLexerAdapter() {
        super(new UnityScriptLexer((Reader) null));
    }
}
