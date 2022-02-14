package com.chen.create.prototype.pojo;

import lombok.Getter;
import lombok.ToString;

/**
 * 地址
 *
 * @author chenzihan
 * @date 2022/02/14
 */
@Getter
public class Address implements Cloneable{
    private final String country;
    private final String city;
    public Address(String country, String city) {
        this.country = country;
        this.city = city;
        System.out.println("调用了 Address 的构造方法");
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
