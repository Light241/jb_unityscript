package com.panfilov.unityscript;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

public class UnityScriptFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        //TODO S.Panfilov this file type is just for debug reason, shold be "js" after all
        fileTypeConsumer.consume(UnityScriptFileType.INSTANCE, "ujs");
        //fileTypeConsumer.consume(UnityScriptFileType.INSTANCE, "js");
    }
}
