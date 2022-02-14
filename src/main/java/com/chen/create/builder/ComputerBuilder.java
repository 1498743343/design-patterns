package com.chen.create.builder;

import com.chen.create.builder.bean.*;

/**
 * 计算机构建器: 构建器可以根据实际需求来设计, 如果我们对对象的构建流程有严格的要求, 那就可以再写一个类去封装这个构建的过程
 * 我在这里使用的构建方法偏向于 lombok 使用的方法, 这样可以将构建过程串联起来
 *
 * @author chenzihan
 * @date 2021/12/24
 */
public class ComputerBuilder {
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

    public ComputerBuilder cpu(Cpu cpu) {
        this.cpu = cpu;
        return this;
    }

    public ComputerBuilder mainboard(Mainboard mainboard) {
        this.mainboard = mainboard;
        return this;
    }
    public ComputerBuilder memory(Memory memory) {
        this.memory = memory;
        return this;
    }
    public ComputerBuilder hardDisc(HardDisc hardDisc) {
        this.hardDisc = hardDisc;
        return this;
    }
    public ComputerBuilder monitor(Monitor monitor) {
        this.monitor = monitor;
        return this;
    }
    public ComputerBuilder keyboard(String keyboard) {
        this.keyboard = keyboard;
        return this;
    }
    public ComputerBuilder mouse(String mouse) {
        this.mouse = mouse;
        return this;
    }
    public Computer build() {
        return new Computer(cpu, mainboard, memory, hardDisc, monitor, keyboard, mouse);
    }

}
