package com.chen.structure.composite;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 包: 这个类可以作为一个容器, 一个包裹中可以包含很多的货物, 同时也可以包含其他的包裹
 *
 * @author chenzihan
 * @date 2021/12/24
 */
public class Package implements Goods{

    private final List<Goods> goodsList;

    @Override
    public void addGoods(Goods goods) {
        goodsList.add(goods);
    }

    @Override
    public double calculativePrice() {
        if(CollectionUtils.isEmpty(goodsList)) {
            return 0;
        }
        return goodsList.stream()
                .mapToDouble(Goods::calculativePrice)
                .sum();
    }

    public Package() {
        this.goodsList = new ArrayList<>();
    }
}
