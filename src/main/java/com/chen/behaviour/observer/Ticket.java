package com.chen.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 票
 *
 * @author chenzihan
 * @date 2022/02/16
 */
public class Ticket {
    private int state;

    public Ticket(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
