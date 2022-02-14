package com.chen.structure.proxy.dynamic.jdk;

import com.chen.structure.proxy.dynamic.User;

/**
 * 用户服务impl
 *
 * @author chenzihan
 * @date 2021/12/22
 */
public class UserServiceImpl implements UserService{
    @Override
    public int add(User user) {
        System.out.println("添加用户成功");
        return 1;
    }

    @Override
    public void delete(User user) {
        System.out.println("删除用户成功");
    }
}
