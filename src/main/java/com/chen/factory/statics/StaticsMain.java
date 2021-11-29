package com.chen.factory.statics;

import com.chen.factory.bean.Animal;

/**
 * 静态工厂模式 main
 *
 * @author chenzihan
 * @date 2021/11/19
 */
public class StaticsMain {
    public static void main(String[] args) {
        StaticsFactory staticsFactory = new DogFactory();
        Animal animal = staticsFactory.getAnimal();
        animal.eat();
    }
}
