package com.chen.behaviour.chain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 请求
 *
 * @author chenzihan
 * @date 2021/12/27
 */
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Request {
    private String id;
    private String name;
    private String password;
}
