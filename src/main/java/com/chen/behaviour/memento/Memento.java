package com.chen.behaviour.memento;

/**
 * 备份
 *
 * @author chenzihan
 * @date 2022/02/16
 */
public interface Memento<T> {
    /**
     * 设置状态
     *
     * @param t t
     */
    void setState(T t);

    /**
     * 获取状态
     *
     * @return {@link T}
     */
    T getState();
}
