package com.chen.behaviour.command;

import com.chen.behaviour.command.pojo.*;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 远程控制
 * 假设遥控器有5个按钮，并且可以自定义每个按钮的功能
 *
 * @author chenzihan
 * @date 2022/02/15
 */
public class RemoteControl {
    private static final int CONTROL_SIZE = 5;
    private static final Map<String, Command> COMMAND_MAP = new HashMap<>();
    static {
        Light light = new Light();
        Television television = new Television();
        COMMAND_MAP.put("0", new NoCommand());
        COMMAND_MAP.put("1", new LightOnCommand(light));
        COMMAND_MAP.put("2", new LightOffCommand(light));
        COMMAND_MAP.put("3", new TelevisionOnCommand(television));
        COMMAND_MAP.put("4", new TelevisionOffCommand(television));
    }
    private Command[] commands;

    public RemoteControl() {
        commands = new Command[CONTROL_SIZE];
        try {
            Properties properties = PropertiesLoaderUtils.loadAllProperties("commands.properties");
            String[] commandsConfig = properties.getProperty("commands.config").split(",");
            for (int i = 0; i < commandsConfig.length; i++) {
                commands[i] = COMMAND_MAP.get(commandsConfig[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void pressKey(int index) {
        commands[index].execute();
    }
}
