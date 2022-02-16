package com.chen.behaviour.mediator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 聊天室
 * 用聊天室封装了用户与用户之间的直接联系，就算多几个用户也可以直接显示出来，避免了用户之间的单对单的联系，后续有需求的更改也可以在此处直接修改
 *
 * @author chenzihan
 * @date 2022/02/16
 */
public class ChatRoom {
    /**
     * 显示消息
     *
     * @param user    用户
     * @param message 消息
     */
    public static void showMessage(User user, String message) {
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + " " + user.getName() + ":" + message);
    }
}
