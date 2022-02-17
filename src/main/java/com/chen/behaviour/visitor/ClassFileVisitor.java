package com.chen.behaviour.visitor;

import java.io.File;

/**
 * class文件游客
 *
 * @author chenzihan
 * @date 2022/02/17
 */
public class ClassFileVisitor implements FileVisitor {
    /**
     * class文件后缀
     */
    private static final String CLASS_FILE_SUFFIX = ".class";

    @Override
    public void visitDir(File file) {
        System.out.println("Visit dir: " + file);
    }

    @Override
    public void visitFile(File file) {
        if (file.getName().endsWith(CLASS_FILE_SUFFIX)) {
            System.out.println("Found java file: " + file);
        }
    }
}
