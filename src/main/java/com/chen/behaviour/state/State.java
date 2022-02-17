package com.chen.behaviour.state;

/**
 * 状态
 *
 * @author chenzihan
 * @date 2022/02/17
 */
public interface State {
    /**
     * 做动作
     *
     * @param televisionContext 电视上下文
     */
    void doAction(TelevisionContext televisionContext);
}
