package com.chen.proxy.dynamic.cglib;

import com.chen.proxy.dynamic.User;

/**
 * 用户服务
 *
 * @author chenzihan
 * @date 2021/12/22
 */
public class UserService {
    public int add(User user) {
        System.out.println("添加用户成功");
        return 1;
    }

    public void delete(String name) {
        System.out.println("删除用户成功");
    }
}
