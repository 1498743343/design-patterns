package com.chen.behaviour.observer;

/**
 * 通知
 *
 * @author chenzihan
 * @date 2022/02/16
 */
public interface Notice {
    /**
     * 通知用户
     *
     * @param user 用户
     * @param type 操作类型
     */
    void notifyUser(User user, String type);
}
