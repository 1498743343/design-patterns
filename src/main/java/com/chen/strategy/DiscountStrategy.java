package com.chen.strategy;

/**
 * 打折策略<br>
 * 此策略是商品直接打折的算法
 *
 * @author chenzihan
 * @date 2021/12/01
 */
public class DiscountStrategy implements Discount{

    /**
     * 折扣: 直接在原价格上打折
     *
     * @param discountInfo 折扣信息
     * @return {@link Double}
     */
    @Override
    public Double discount(DiscountInfo discountInfo) {
        double originalPrice = discountInfo.getOriginalPrice();
        double discount = discountInfo.getDiscount();
        return originalPrice * discount;
    }
}
