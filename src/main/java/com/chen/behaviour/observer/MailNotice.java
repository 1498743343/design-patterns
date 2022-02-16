package com.chen.behaviour.observer;

/**
 * 邮件通知
 *
 * @author chenzihan
 * @date 2022/02/16
 */
public class MailNotice implements Notice{

    @Override
    public void notifyUser(User user, String type) {
        System.out.println("邮件信息：" + "尊敬的" + user.getName() + "您好，" + type + " 成功！");
    }
}
