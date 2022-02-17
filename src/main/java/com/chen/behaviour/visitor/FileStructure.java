package com.chen.behaviour.visitor;

import java.io.File;
import java.util.Objects;

/**
 * 文件结构
 *
 * @author chenzihan
 * @date 2022/02/17
 */
public class FileStructure {
    private File path;

    public void handle(FileVisitor visitor) {
        scan(this.path, visitor);
    }

    private void scan(File file, FileVisitor visitor) {
        if (file.isDirectory()) {
            // 让访问者处理文件夹:
            visitor.visitDir(file);
            for (File sub : Objects.requireNonNull(file.listFiles())) {
                // 递归处理子文件夹:
                scan(sub, visitor);
            }
        } else if (file.isFile()) {
            // 让访问者处理文件:
            visitor.visitFile(file);
        }
    }

    public FileStructure(File path) {
        this.path = path;
    }
}
