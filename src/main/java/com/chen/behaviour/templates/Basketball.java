package com.chen.behaviour.templates;

/**
 * 篮球
 *
 * @author chenzihan
 * @date 2022/02/17
 */
public class Basketball extends Sport {
    @Override
    protected void warmUp() {
        System.out.println("篮球热身");
    }

    @Override
    protected void doSport() {
        System.out.println("打篮球");
    }

    @Override
    protected void relax() {
        System.out.println("篮球拉伸");
    }
}
