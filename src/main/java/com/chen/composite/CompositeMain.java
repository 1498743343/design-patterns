package com.chen.composite;

/**
 * 组合模式 main: 组合模式适用于构造树状结构的对象, 同时我们可以把他当作一个整体来处理
 * 下面的例子就是将一个包裹作为一个整体的树状对象, 最后可以做统一的价格汇总
 *
 * @author chenzihan
 * @date 2021/12/24
 */
public class CompositeMain {
    public static void main(String[] args) {
        Goods goods = new Package();
        Goods goods1 = new Package();
        Goods goods2 = new Package();
        Goods goods3 = new Package();
        Paper paper = new Paper(8.5);
        Shoes shoes = new Shoes(99.9);
        Shirts shirts = new Shirts(49.9);
        goods.addGoods(paper);
        goods.addGoods(shirts);
        goods.addGoods(goods1);
        goods.addGoods(goods2);
        goods1.addGoods(shoes);
        goods1.addGoods(shoes);
        goods2.addGoods(shirts);
        goods2.addGoods(shirts);
        goods2.addGoods(goods3);
        goods3.addGoods(paper);
        goods3.addGoods(paper);
        double price = goods.calculativePrice();
        System.out.println("总价格是: " + price);

    }
}
