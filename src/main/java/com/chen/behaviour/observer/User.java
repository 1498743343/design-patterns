package com.chen.behaviour.observer;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

/**
 * 用户
 *
 * @author chenzihan
 * @date 2022/02/16
 */
@Builder
@Getter
public class User {
    private List<Ticket> tickets;
    private List<Notice> notices;
    private Long id;
    /**
     * 名字
     */
    private String name;
    /**
     * 电话号码
     */
    private String phoneNumber;
    /**
     * 邮件
     */
    private String mail;

    public void buyTicket(Ticket ticket) {
        ticket.setState(0);
        this.tickets.add(ticket);
        notices.parallelStream()
                .forEach(notice -> notice.notifyUser(this, "购买"));
    }

    public void changeTicket(Ticket ticket) {
        ticket.setState(1);
        notices.parallelStream()
                .forEach(notice -> notice.notifyUser(this, "改签"));
    }

    public void returnTicket(Ticket ticket) {
        tickets.remove(ticket);
        notices.parallelStream()
                .forEach(notice -> notice.notifyUser(this, "退票"));
    }

}
