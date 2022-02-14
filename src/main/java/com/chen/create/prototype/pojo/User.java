package com.chen.create.prototype.pojo;

import lombok.Getter;
import lombok.ToString;

/**
 * 用户
 *
 * @author chenzihan
 * @date 2022/02/14
 */
@Getter
@ToString
public class User implements Cloneable{
    private final Long id;
    private final String name;
    private final Address address;

    public User(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
        System.out.println("调用了 User 的构造方法");
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
