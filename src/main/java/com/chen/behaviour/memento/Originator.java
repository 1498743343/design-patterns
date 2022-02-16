package com.chen.behaviour.memento;

/**
 * 发起者
 * 不对外暴露 Memento，通过 CareTaker 来操作备份的状态，当需要追加备份的逻辑时，在 CareTaker 中添加即可，做到 Originator 和 Memento 的解耦
 * @author chenzihan
 * @date 2022/02/16
 */
public class Originator {
    private Integer state;
    private final CareTaker<Integer> careTaker;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Originator(int state) {
        this.state = state;
        this.careTaker = new CareTaker<>(new MyMemento());
    }

    public void saveStateInMemento() {
        this.careTaker.setState(this.state);
    }

    public void rollBack() {
        this.state = careTaker.getState();
    }

    private static class MyMemento implements Memento<Integer> {
        private Integer state;

        @Override
        public void setState(Integer state) {
            this.state = state;
        }

        @Override
        public Integer getState() {
            return this.state;
        }
    }
}
