package com.chen.create.factory.easy;

import com.chen.create.factory.bean.Animal;

/**
 * 简单工厂模式 main
 *
 * @author chenzihan
 * @date 2021/11/19
 */
public class EasyMain {
    public static void main(String[] args) {
        Animal animal = EasyFactory.getAnimal("dog");
        animal.eat();
    }
}
