package com.chen.proxy.dynamic.jdk;

import com.chen.proxy.dynamic.User;

/**
 * 用户服务
 *
 * @author chenzihan
 * @date 2021/12/22
 */
public interface UserService {
    /**
     * 添加
     */
    int add(User user);

    /**
     * 删除
     */
    void delete(User user);
}
