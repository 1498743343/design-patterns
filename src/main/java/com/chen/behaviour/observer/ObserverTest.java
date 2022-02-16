package com.chen.behaviour.observer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式：又称发布-订阅模式，是一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
 * 例如改签火车票以后，会通过短信、邮件、app内部消息等方式通知用户
 * @author chenzihan
 * @date 2022/02/16
 */
public class ObserverTest {
    @Test
    public void t1() {
        List<Notice> notices = getNotices();
        User user = User.builder()
                .id(1L)
                .name("czh")
                .phoneNumber("15720061511")
                .mail("xxxx@qq.com")
                .notices(getNotices())
                .tickets(new ArrayList<>())
                .build();
        Ticket ticket = new Ticket(0);
        user.buyTicket(ticket);
        user.changeTicket(ticket);
        user.returnTicket(ticket);
    }

    public static List<Notice> getNotices() {
        List<Notice> notices = new ArrayList<>();
        notices.add(new AppNotice());
        notices.add(new MailNotice());
        notices.add(new MessageNotice());
        return notices;
    }
}
