package com.chen.behaviour.memento;

/**
 * 管理者
 *
 * @author chenzihan
 * @date 2022/02/16
 */
public class CareTaker<T> {
    private final Memento<T> memento;

    public CareTaker(Memento<T> memento) {
        this.memento = memento;
    }

    public void setState(T t) {
        this.memento.setState(t);
    }

    public T getState() {
        return this.memento.getState();
    }
}
