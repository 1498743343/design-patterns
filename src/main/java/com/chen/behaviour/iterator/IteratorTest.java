package com.chen.behaviour.iterator;

/**
 * 迭代器模式：又叫做游标（Cursor）模式。提供一种方法顺序访问一个聚合对象中的各个元素，而又不需要暴露该对象的内部结构
 * 迭代器模式在 java 的集合中已经非常常见了
 *
 * @author chenzihan
 * @date 2022/02/16
 */
public class IteratorTest {
    public static void main(String[] args) {
        String[] names = new String[]{"czh", "cxy", "cczz"};
        StringContainer stringContainer = new StringContainer(names);
        Iterator<String> iterator = stringContainer.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
