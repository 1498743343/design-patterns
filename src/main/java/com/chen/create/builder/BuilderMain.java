package com.chen.create.builder;

import com.chen.create.builder.bean.*;

/**
 * 建造者模式: 又称生成器模式, 使你能够分步骤创建复杂对象。 该模式允许你使用相同的创建代码生成不同类型和形式的对象
 *
 * @author chenzihan
 * @date 2021/12/24
 */
public class BuilderMain {
    public static void main(String[] args) {
        Computer computer = Computer.builder()
                .cpu(new Cpu("5800X"))
                .memory(new Memory("金士顿 3000 32G"))
                .mainboard(new Mainboard("迫击炮 B550M"))
                .hardDisc(new HardDisc("西数蓝盘"))
                .monitor(new Monitor("三星 4k 27"))
                .keyboard("罗技 k380")
                .mouse("罗技 m330")
                .build();
        System.out.println(computer);
        Computer computer1 = new Director().nomalComputer(Computer.builder());
        System.out.println(computer1);
    }
}
