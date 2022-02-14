package com.chen.behaviour.strategy;

/**
 * 折扣<br>
 * 常见的打折活动有：直接折扣、满减 这两种方式; 我们在这里就用这两种常见的方式来实现策略模式
 *
 * @author chenzihan
 * @date 2021/12/01
 */
public interface Discount {
    /**
     * 折扣
     *
     * @param discountInfo 折扣信息
     * @return {@link Double}
     */
    Double discount(DiscountInfo discountInfo);
}
