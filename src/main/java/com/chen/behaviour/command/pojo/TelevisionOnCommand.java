package com.chen.behaviour.command.pojo;

/**
 * 打开电视命令
 *
 * @author chenzihan
 * @date 2022/02/15
 */
public class TelevisionOnCommand implements Command {
    private Television television;

    @Override
    public void execute() {
        television.on();
    }

    public TelevisionOnCommand(Television television) {
        this.television = television;
    }
}
