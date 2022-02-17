package com.chen.behaviour.state;

/**
 * 电视上下文
 *
 * @author chenzihan
 * @date 2022/02/17
 */
public class TelevisionContext {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void pressButton() {
        this.state.doAction(this);
    }
}
