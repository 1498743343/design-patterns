package com.chen.behaviour.iterator;

/**
 * 容器
 *
 * @author chenzihan
 * @date 2022/02/16
 */
public interface Container<T> {

    /**
     * 得到迭代器
     *
     * @return {@link Iterator}<{@link T}>
     */
    Iterator<T> getIterator();
}
