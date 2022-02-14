package com.chen.structure.composite;

/**
 * 衬衫
 *
 * @author chenzihan
 * @date 2021/12/24
 */
public class Shirts implements Goods {
    private final double price;

    @Override
    public void addGoods(Goods goods) {
        throw new UnsupportedOperationException();
    }

    @Override
    public double calculativePrice() {
        return price;
    }

    public Shirts(double price) {
        this.price = price;
    }
}
