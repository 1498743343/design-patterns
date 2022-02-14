package com.chen.create.builder;

import com.chen.create.builder.bean.*;

/**
 * 主管: 对于常用的、指定步骤的、固定的对象, 我们可以将它的构建过程封装起来, 便于使用
 *
 * @author chenzihan
 * @date 2021/12/24
 */
public class Director {

    /**
     * 正常的电脑
     *
     * @param builder 构建器
     * @return {@link Computer}
     */
    public Computer nomalComputer(ComputerBuilder builder) {
        return Computer.builder()
                .cpu(new Cpu("5800X"))
                .memory(new Memory("海康威视 3000 16G"))
                .mainboard(new Mainboard("迫击炮 B550M"))
                .hardDisc(new HardDisc("sn750"))
                .monitor(new Monitor("三星 2k 27"))
                .keyboard("罗技 k380")
                .mouse("罗技 m330")
                .build();
    }
}
