package com.chen.behaviour.templates;

/**
 * 体育运动
 *
 * @author chenzihan
 * @date 2022/02/17
 */
public abstract class Sport {

    /**
     * 行动
     * 不管做什么运动，都是这三种步骤，先热身，然后运动，最后放松，虽然不同的运动具体实行起来不一样，但是步骤是固定的
     */
    public void action() {
        warmUp();
        doSport();
        relax();
    }

    /**
     * 热身
     */
    protected abstract void warmUp();

    /**
     * 做运动
     */
    protected abstract void doSport();

    /**
     * 放松
     */
    protected abstract void relax();
}
