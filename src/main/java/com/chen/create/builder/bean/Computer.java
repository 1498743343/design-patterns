package com.chen.create.builder.bean;

import com.chen.create.builder.ComputerBuilder;
import lombok.Data;

/**
 * 计算机
 *
 * @author chenzihan
 * @date 2021/12/24
 */
@Data
public class Computer {
    /**
     * cpu
     */
    private Cpu cpu;
    /**
     * 主板
     */
    private Mainboard mainboard;
    /**
     * 内存
     */
    private Memory memory;
    /**
     * 硬盘
     */
    private HardDisc hardDisc;
    /**
     * 监控
     */
    private Monitor monitor;
    /**
     * 键盘
     */
    private String keyboard;
    /**
     * 鼠标
     */
    private String mouse;

    public static ComputerBuilder builder() {
        return new ComputerBuilder();
    }

    public Computer(Cpu cpu, Mainboard mainboard, Memory memory, HardDisc hardDisc, Monitor monitor, String keyboard, String mouse) {
        this.cpu = cpu;
        this.mainboard = mainboard;
        this.memory = memory;
        this.hardDisc = hardDisc;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}
