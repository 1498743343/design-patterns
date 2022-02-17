package com.chen.behaviour.visitor;

import java.io.File;

/**
 * java文件访问
 *
 * @author chenzihan
 * @date 2022/02/17
 */
public class JavaFileVisitor implements FileVisitor {
    /**
     * java文件后缀
     */
    private static final String JAVA_FILE_SUFFIX = ".class";

    @Override
    public void visitDir(File file) {
        System.out.println("Visit dir: " + file);
    }

    @Override
    public void visitFile(File file) {
        if (file.getName().endsWith(JAVA_FILE_SUFFIX)) {
            System.out.println("Found java file: " + file);
        }
    }
}
