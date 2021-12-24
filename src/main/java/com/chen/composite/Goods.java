package com.chen.composite;


/**
 * 货物
 *
 * @author chenzihan
 * @date 2021/12/24
 */
public interface Goods {
    /**
     * 添加商品
     *
     * @param goods 货物
     */
    void addGoods(Goods goods);

    /**
     * 计算本货物下所有货物的价格
     *
     * @return double
     */
    double calculativePrice();

}
