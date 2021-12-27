package com.chen.flyweight;

import com.chen.builder.bean.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * 享元模式 main: 享元模式是一种结构型设计模式, 对于基本的元数据我们可以将他们保存到容器中作为共享数据, 通过共享多个对象所共有的相同状态,
 * 让你能在有限的内存容量中载入更多对象。这种设计模式对元数据有严格的要求, 一定不可以修改元数据中的内容 <br>
 * 举例: 如我现在要开一个网吧, 有5种配置, 每种配置 20 台, 网吧会按照电脑的配置去分区, 收费标准也不同, 但相同配置的电脑只是上机号码不一样,
 * 此时我可以将不同配置的电脑作为元数据共享 <br>
 *
 * @author chenzihan
 * @date 2021/12/27
 */
public class FlyweightMain {
    public static final Map<Integer, Computer> COMPUTER_MAP = new HashMap<>(); 
    static {
        for (int i = 0; i < 5; i++) {
            COMPUTER_MAP.put(i, Computer.builder()
                    .cpu(new Cpu(String.valueOf(i)))
                    .memory(new Memory(String.valueOf(i)))
                    .mainboard(new Mainboard(String.valueOf(i)))
                    .hardDisc(new HardDisc(String.valueOf(i)))
                    .monitor(new Monitor(String.valueOf(i)))
                    .build());
        }
    }
    public static void main(String[] args) {
        ArrayList<ComputerInfo> bars = new ArrayList<>();
        IntStream.range(0,5)
                .forEach(i -> IntStream.rangeClosed(1,20)
                        .forEach(j -> bars.add(new ComputerInfo(i * 20 + j, COMPUTER_MAP.get(i)))));
        System.out.println(bars);
    }
}
