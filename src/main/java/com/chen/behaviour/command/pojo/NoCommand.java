package com.chen.behaviour.command.pojo;

/**
 * no命令
 *
 * @author chenzihan
 * @date 2022/02/15
 */
public class NoCommand implements Command{
    @Override
    public void execute() {
        System.out.println("不执行任何操作");
    }
}
