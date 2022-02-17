package com.chen.behaviour.templates;

/**
 * 模板模式：父类定义执行的流程或者算法骨架，子类负责实现具体的算法
 *
 * @author chenzihan
 * @date 2022/02/17
 */
public class TemplateTest {
    public static void main(String[] args) {
        Sport sport = new Football();
        sport.action();
        sport = new Basketball();
        sport.action();
    }
}
