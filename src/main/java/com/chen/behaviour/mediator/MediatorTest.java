package com.chen.behaviour.mediator;

/**
 * 中介模式：又称调停者模式。用一个调停对象来封装一系列的对象交互。
 * 比如多个类之间存在大量的关联关系，若一个对象发生改变，我们也需要跟踪与之相关联的对象，同时做出相应的处理。如果我们用一个中介类封装了他们之间的关联，
 * 类之间就会变的耦合松散，而且可以独立地改变它们之间的交互。
 *
 * @author chenzihan
 * @date 2022/02/16
 */
public class MediatorTest {
    public static void main(String[] args) {
        User czh = new User("czh");
        User cxy = new User("cxy");
        cxy.sendMessage("hello");
        czh.sendMessage("no hello");
    }
}
