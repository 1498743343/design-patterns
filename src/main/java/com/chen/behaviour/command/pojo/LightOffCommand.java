package com.chen.behaviour.command.pojo;

/**
 * 关灯命令
 *
 * @author chenzihan
 * @date 2022/02/15
 */
public class LightOffCommand implements Command{
    private Light light;
    @Override
    public void execute() {
        light.off();
    }

    public LightOffCommand(Light light) {
        this.light = light;
    }
}
