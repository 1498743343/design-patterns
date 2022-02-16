package com.chen.behaviour.iterator;

/**
 * 迭代器
 *
 * @author chenzihan
 * @date 2022/02/16
 */
public interface Iterator<T> {
    /**
     * 是否还有下一个元素
     *
     * @return boolean
     */
    boolean hasNext();

    /**
     * 获取下一个元素
     *
     * @return {@link T}
     */
    T next();
}
