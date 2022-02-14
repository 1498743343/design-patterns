package com.chen.create.singleton;

import com.chen.create.singleton.pojo.*;
import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;


/**
 * 单例模式：顾名思义，就是一个类只提供一个实体对象给外部访问，是 Java 中最简单的设计模式之一，但是单例模式的实现方式却多种多样，里面也牵扯到了线程安全问题
 *
 * @author chenzihan
 * @date 2022/02/14
 */
public class SingletonTest {
    public static final ExecutorService EXECUTOR_SERVICE = Executors.newFixedThreadPool(4);

    @Test
    public void t1() {
        IntStream.rangeClosed(0, 10)
                .forEach(i -> EXECUTOR_SERVICE.submit(() -> {
                    LazySingleton instance = LazySingleton.getInstance();
                    System.out.println(Thread.currentThread().getName() + ": " + instance.hashCode());
                }));
    }

    @Test
    public void t2() {
        IntStream.rangeClosed(0, 10)
                .forEach(i -> EXECUTOR_SERVICE.submit(() -> {
                    LazySafeSingleton instance = LazySafeSingleton.getInstance();
                    System.out.println(Thread.currentThread().getName() + ": " + instance.hashCode());
                }));
    }

    @Test
    public void t3() {
        IntStream.rangeClosed(0, 10)
                .forEach(i -> EXECUTOR_SERVICE.submit(() -> {
                    NonLazySingleton instance = NonLazySingleton.getInstance();
                    System.out.println(Thread.currentThread().getName() + ": " + instance.hashCode());
                }));
    }

    @Test
    public void t4() {
        IntStream.rangeClosed(0, 10)
                .forEach(i -> EXECUTOR_SERVICE.submit(() -> {
                    StaticInnerSingleton instance = StaticInnerSingleton.getInstance();
                    System.out.println(Thread.currentThread().getName() + ": " + instance.hashCode());
                }));
    }

    @Test
    public void t5() {
        IntStream.rangeClosed(0, 10)
                .forEach(i -> EXECUTOR_SERVICE.submit(() -> {
                    DCLSingleton instance = DCLSingleton.getInstance();
                    System.out.println(Thread.currentThread().getName() + ": " + instance.hashCode());
                }));
    }
}
