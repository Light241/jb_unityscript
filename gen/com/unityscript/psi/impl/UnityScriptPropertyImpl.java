// This is a generated file. Not intended for manual editing.
package com.unityscript.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.unityscript.psi.UnityScriptProperty;
import com.unityscript.psi.UnityScriptVisitor;
import org.jetbrains.annotations.NotNull;

public class UnityScriptPropertyImpl extends ASTWrapperPsiElement implements UnityScriptProperty {

  public UnityScriptPropertyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof UnityScriptVisitor) ((UnityScriptVisitor)visitor).visitProperty(this);
    else super.accept(visitor);
  }

}
