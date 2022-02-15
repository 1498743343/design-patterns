package com.chen.behaviour.command.pojo;

/**
 * 开灯命令
 *
 * @author chenzihan
 * @date 2022/02/15
 */
public class LightOnCommand implements Command{
    private Light light;
    @Override
    public void execute() {
        light.on();
    }

    public LightOnCommand(Light light) {
        this.light = light;
    }
}
