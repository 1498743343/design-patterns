package com.chen.create.factory.statics;

import com.chen.create.factory.bean.Animal;

/**
 * 静态工厂模式<br>
 * 静态工厂模式区别于简单工厂模式, 不再根据入参去判断创建什么对象, 而是为每一类对象分配一个工厂, 需要什么类型的对象直接去对应的工厂获取
 * 很鸡肋, 非常不建议使用
 *
 * @author chenzihan
 * @date 2021/11/25
 */
public interface StaticsFactory {
    /**
     * 获取动物
     *
     * @return {@link Animal}
     */
    Animal getAnimal();
}
