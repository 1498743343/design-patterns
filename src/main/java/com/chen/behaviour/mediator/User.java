package com.chen.behaviour.mediator;

/**
 * 用户
 *
 * @author chenzihan
 * @date 2022/02/16
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 在聊天室中发送消息
     *
     * @param message 消息
     */
    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
