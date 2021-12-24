package com.chen.composite;

/**
 * 鞋子
 *
 * @author chenzihan
 * @date 2021/12/24
 */
public class Shoes implements Goods {
    private final double price;

    @Override
    public void addGoods(Goods goods) {
        throw new UnsupportedOperationException();
    }

    @Override
    public double calculativePrice() {
        return price;
    }

    public Shoes(double price) {
        this.price = price;
    }
}
