// This is a generated file. Not intended for manual editing.
package com.unityscript.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import com.unityscript.psi.impl.UnityScriptPropertyImpl;

public interface UnityScriptTypes {

  IElementType PROPERTY = new UnityScriptElementType("PROPERTY");

  IElementType COMMENT = new UnityScriptTokenType("COMMENT");
  IElementType CRLF = new UnityScriptTokenType("CRLF");
  IElementType KEY = new UnityScriptTokenType("KEY");
  IElementType SEPARATOR = new UnityScriptTokenType("SEPARATOR");
  IElementType VALUE = new UnityScriptTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == PROPERTY) {
        return new UnityScriptPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
