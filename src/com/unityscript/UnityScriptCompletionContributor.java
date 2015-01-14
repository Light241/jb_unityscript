package com.unityscript;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import com.unityscript.psi.UnityScriptTypes;
import org.jetbrains.annotations.NotNull;

public class UnityScriptCompletionContributor extends CompletionContributor {
    public UnityScriptCompletionContributor() {
        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement(UnityScriptTypes.VALUE).withLanguage(UnityScriptLanguage.INSTANCE),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        resultSet.addElement(LookupElementBuilder.create("Hello"));
                    }
                }
        );
    }
}