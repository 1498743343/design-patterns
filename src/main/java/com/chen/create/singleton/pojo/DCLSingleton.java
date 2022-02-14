package com.chen.create.singleton.pojo;

/**
 * double-checked locking
 * JDK 版本：JDK1.5 起
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：较复杂
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 *
 * @author chenzihan
 * @date 2022/02/14
 */
public class DCLSingleton {
    /**
     * 注意 volatile 关键字，在 jdk1.5 版本中，volatile 实现了禁止指令重排序，修复了 DCL 问题
     */
    private volatile static DCLSingleton instance;

    private DCLSingleton() {
    }

    public static DCLSingleton getInstance() {
        // 第一个 if 判断是为了优化锁的颗粒度，提升多线程下的访问速度
        if (instance == null) {
            synchronized (DCLSingleton.class) {
                // 第二个 if 是为了防止重复实例化单例对象，虽然这部分代码在同步代码块内，但是在多线程环境下，可能有多个线程都通过了第一个 if 条件，如果没有第二个if，
                // 在单例对象创建期间，通过了第一个 if 条件的线程会在锁被释放后，重新获取锁并实例化单例对象
                if (instance == null) {
                    instance = new DCLSingleton();
                }
            }
        }
        return instance;
    }
}
