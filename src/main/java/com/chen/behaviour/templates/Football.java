package com.chen.behaviour.templates;

/**
 * 足球
 *
 * @author chenzihan
 * @date 2022/02/17
 */
public class Football extends Sport {
    @Override
    protected void warmUp() {
        System.out.println("足球热身");
    }

    @Override
    protected void doSport() {
        System.out.println("踢足球");
    }

    @Override
    protected void relax() {
        System.out.println("足球拉伸");
    }
}
