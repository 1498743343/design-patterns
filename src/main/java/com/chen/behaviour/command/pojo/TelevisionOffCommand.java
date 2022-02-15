package com.chen.behaviour.command.pojo;

/**
 * 关闭电视命令
 *
 * @author chenzihan
 * @date 2022/02/15
 */
public class TelevisionOffCommand implements Command {
    private Television television;

    @Override
    public void execute() {
        television.off();
    }

    public TelevisionOffCommand(Television television) {
        this.television = television;
    }
}
