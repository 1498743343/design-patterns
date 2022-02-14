package com.chen.structure.composite;

/**
 * 纸
 *
 * @author chenzihan
 * @date 2021/12/24
 */
public class Paper implements Goods {
    private final double price;

    @Override
    public void addGoods(Goods goods) {
        throw new UnsupportedOperationException();
    }

    @Override
    public double calculativePrice() {
        return price;
    }

    public Paper(double price) {
        this.price = price;
    }
}
