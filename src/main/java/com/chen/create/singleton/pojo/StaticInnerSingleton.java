package com.chen.create.singleton.pojo;

/**
 * 静态内部类单例
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：一般
 * 描述：这种方式可以实现和 DCL 一样的效果，既保证了懒加载又保证了线程安全和效率。运用到的原理是类的加载时机，如果使用到了 StaticInnerSingleton 但是
 * 没有使用 INSTANCE，那么就不会初始化 INSTANCE 也不会加载 InnerClass，只有调用 StaticInnerSingleton.getInstance 才会实例化单例对象
 * @author chenzihan
 * @date 2022/02/14
 */
public class StaticInnerSingleton {
    private static class InnerClass {
        private static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
    }
    private StaticInnerSingleton() {

    }

    public static StaticInnerSingleton getInstance() {
        return InnerClass.INSTANCE;
    }
}
