package com.chen.behaviour.observer;

/**
 * 短信通知
 *
 * @author chenzihan
 * @date 2022/02/16
 */
public class MessageNotice implements Notice {
    @Override
    public void notifyUser(User user, String type) {
        System.out.println("手机短信：" + "尊敬的" + user.getName() + "您好，" + type + " 成功！");
    }
}
