package com.chen.create.factory.easy;

import com.chen.create.factory.bean.*;

/**
 * 简单工厂模式<br>
 * 所有的动物都在一个方法中进行创建, 根据动物名进行创建
 *
 * @author chenzihan
 * @date 2021/11/19
 */
public class EasyFactory {
    /**
     * 获取动物
     *
     * @param animalName 动物的名字
     * @return {@link Animal}
     */
    public static Animal getAnimal(String animalName) {
        animalName = animalName.toLowerCase();
        switch (animalName) {
            case "carp":
                return new Carp();
            case "crucian":
                return new Crucian();
            case "dog":
                return new Dog();
            case "horse":
                return new Horse();
            case "sparrow":
                return new Sparrow();
            case "woodpecker":
                return new Woodpecker();
            default:
                throw new IllegalArgumentException("非法的动物名: " + animalName);
        }
    }
}
