package com.chen.behaviour.chain;

/**
 * 日志处理程序
 *
 * @author chenzihan
 * @date 2021/12/27
 */
public class LogHandler implements Handler {
    @Override
    public void process(Request request) {
        System.out.println("logHandler -> " + request.toString());
    }
}
