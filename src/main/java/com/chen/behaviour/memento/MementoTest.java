package com.chen.behaviour.memento;

/**
 * 备忘录模式：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态。
 * 一般来讲备忘录模式有三个角色：Memento(备份角色)、Originator(被备份角色) 和 CareTaker(管理角色)，可以根据不同的场景将三者进行组合
 * @author chenzihan
 * @date 2022/02/16
 */
public class MementoTest {
    public static void main(String[] args) {
        Originator originator = new Originator(10);
        originator.saveStateInMemento();
        originator.setState(12);
        originator.setState(15);
        System.out.println(originator.getState());
        originator.rollBack();
        System.out.println(originator.getState());
    }
}
