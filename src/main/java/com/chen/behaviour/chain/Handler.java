package com.chen.behaviour.chain;

/**
 * 处理程序
 *
 * @author chenzihan
 * @date 2021/12/27
 */
public interface Handler {
    /**
     * 处理
     *
     * @param request 请求
     */
    void process(Request request);
}
