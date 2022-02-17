package com.chen.behaviour.state;

/**
 * 打开状态
 *
 * @author chenzihan
 * @date 2022/02/17
 */
public class OnState implements State{
    @Override
    public void doAction(TelevisionContext televisionContext) {
        System.out.println("电视已关闭");
        televisionContext.setState(new OffState());
    }
}
