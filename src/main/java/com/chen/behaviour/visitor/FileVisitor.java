package com.chen.behaviour.visitor;

import java.io.File;

/**
 * 文件访问
 *
 * @author chenzihan
 * @date 2022/02/17
 */
public interface FileVisitor {
    /**
     * 访问目录
     *
     * @param file 文件
     */
    void visitDir(File file);

    /**
     * 访问文件
     *
     * @param file 文件
     */
    void visitFile(File file);
}
