package com.chen.behaviour.command;

import org.junit.Test;

/**
 * 命令模式：将请求封装成对象，将动作请求者和动作执行者解耦。
 * 优点： 1、降低了系统耦合度。 2、新的命令可以很容易添加到系统中去。
 * 缺点：使用命令模式可能会导致某些系统有过多的具体命令类。
 * 在我们举的例子中，遥控器是请求者，执行者是各种电器，当然我简化了命令模式的代码，没有包含 redo 和 undo 的逻辑
 *
 * @author chenzihan
 * @date 2022/02/15
 */
public class CommandTest {

    @Test
    public void t1() {
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.pressKey(0);
        remoteControl.pressKey(2);
        remoteControl.pressKey(4);
    }
}
