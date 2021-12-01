package com.chen.strategy;

/**
 * 满减折扣<br>
 * 此策略是满减折扣的算法
 *
 * @author chenzihan
 * @date 2021/12/01
 */
public class FullDiscountStrategy implements Discount {
    /**
     * 每满一定金额减一定金额
     *
     * @param discountInfo 折扣信息
     * @return {@link Double}
     */
    @Override
    public Double discount(DiscountInfo discountInfo) {
        double originalPrice = discountInfo.getOriginalPrice();
        double price = discountInfo.getPrice();
        double reducePrice = discountInfo.getReducePrice();
        return originalPrice - (int)(originalPrice / price) * reducePrice;
    }
}
