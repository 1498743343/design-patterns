package com.chen.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略模式 main
 * 常见的策略有打折和满减，但是有时不同的商品也会有不同的折扣，这里不进行复杂的逻辑实现，如果需要进实现这种折扣的话，可以考虑将在商品中绑定一个折扣信息的属性，
 * 这样在进行结算时可以算出每种商品的金额再累加
 *
 * @author chenzihan
 * @date 2021/12/01
 */
public class StrategyMain {
    public static final Map<String, Discount> DISCOUNT_MAP = new HashMap<>();
    static {
        DISCOUNT_MAP.put("0", new DiscountStrategy());
        DISCOUNT_MAP.put("1", new FullDiscountStrategy());
    }
    public static void main(String[] args) {
        // 在实际使用时, 我们可以将不同的策略对象添加到一个map中, 也可以将它注册为 spring bean, 这样可以不用重复创建对象, 并且可以捅过我们自定义的方式去取到合适的策略
        Discount discount = DISCOUNT_MAP.get("1");
        DiscountInfo discountInfo = new DiscountInfo();
        discountInfo.setOriginalPrice(112);
        discountInfo.setPrice(20);
        discountInfo.setReducePrice(5);
//        discountInfo.setDiscount(0.67);
        Double result = discount.discount(discountInfo);
        System.out.println(result);
    }
}
