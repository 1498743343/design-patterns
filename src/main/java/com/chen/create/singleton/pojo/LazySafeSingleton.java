package com.chen.create.singleton.pojo;

/**
 * 线程安全懒汉式
 * <p>
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：易
 * 描述：这种方式具备很好的 lazy loading，在多线程环境下也可以正常使用
 * 优点：第一次调用才初始化，避免内存浪费。
 * 缺点：必须对 getInstance() 方法加锁才能保证单例，如果 getInstance() 的访问量大，效率会极其低下
 *
 * @author chenzihan
 * @date 2022/02/14
 */
public class LazySafeSingleton {
    private static LazySafeSingleton instance;

    private LazySafeSingleton() {
    }

    public static synchronized LazySafeSingleton getInstance() {
        if (instance == null) {
            instance = new LazySafeSingleton();
        }
        return instance;
    }
}
