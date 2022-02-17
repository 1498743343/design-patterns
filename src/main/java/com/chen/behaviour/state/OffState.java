package com.chen.behaviour.state;

/**
 * 关闭状态
 *
 * @author chenzihan
 * @date 2022/02/17
 */
public class OffState implements State{
    @Override
    public void doAction(TelevisionContext televisionContext) {
        System.out.println("电视已打开");
        televisionContext.setState(new OnState());
    }
}
