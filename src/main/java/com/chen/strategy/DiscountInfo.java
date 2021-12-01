package com.chen.strategy;

/**
 * 折扣信息
 *
 * @author chenzihan
 * @date 2021/12/01
 */
public class DiscountInfo {
    /**
     * 折扣
     */
    private double discount;
    /**
     * 原始价格
     */
    private double originalPrice;
    /**
     * 价格
     */
    private double price;
    /**
     * 降低价格
     */
    private double reducePrice;

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getReducePrice() {
        return reducePrice;
    }

    public void setReducePrice(double reducePrice) {
        this.reducePrice = reducePrice;
    }

    public DiscountInfo() {
    }

}
