package com.chen.behaviour.chain;

import java.util.ArrayList;
import java.util.List;

/**
 * 责任链模式 main: 责任链模式是一种行为设计模式, 请求沿着处理者链进行发送。根据需求会在链中找到一个处理者处理请求或者每个处理者都处理然后转发到下一个<br>
 * 使用场景不是责任链模式关心的事, 注意力应该放在对于不同的功能拆分为多个类型处理, 多个类绑定在一条链上
 *
 * @author chenzihan
 * @date 2021/12/27
 */
public class ChainMain {
    public static final List<Handler> HANDLERS = new ArrayList<>();
    static {
        HANDLERS.add(new LogHandler());
        HANDLERS.add(new ParamsHandler());
    }
    public static void main(String[] args) {
        Request request = new Request("1", "test", "entry111222");
        HANDLERS.forEach(handler -> handler.process(request));
    }
}
