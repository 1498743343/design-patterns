package com.chen.behaviour.state;

/**
 * 状态模式：一个类包含自己的状态，当状态改变时这个类表现出不同的行为
 * 比如电视机，它在关闭状态下，按开关就是打开，在打开状态下，按开关就是关闭
 *
 * @author chenzihan
 * @date 2022/02/17
 */
public class StateTest {
    public static void main(String[] args) {
        TelevisionContext televisionContext = new TelevisionContext();
        televisionContext.setState(new OffState());
        // 虽然多次调用 pressButton 方法，但是功能却不同
        televisionContext.pressButton();
        System.out.println(televisionContext.getState());
        televisionContext.pressButton();
        System.out.println(televisionContext.getState());
    }
}
