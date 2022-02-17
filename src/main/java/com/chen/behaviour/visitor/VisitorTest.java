package com.chen.behaviour.visitor;

import java.io.File;

/**
 * 访问者模式：个作用于某对象结构中的各元素的操作。它使你可以在不改变各元素的类的前提下定义作用于这些元素的新操作。
 * 讲人话就是数据结构固定，不改变被访问对象的情况下，改变执行的逻辑
 *
 * @author chenzihan
 * @date 2022/02/17
 */
public class VisitorTest {
    private static final String FILE_PATH = "";
    public static void main(String[] args) {
        FileVisitor fileVisitor = new JavaFileVisitor();
        FileStructure fileStructure = new FileStructure(new File(FILE_PATH));
        fileStructure.handle(fileVisitor);
    }
}
