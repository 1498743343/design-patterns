package com.chen.structure.proxy.dynamic;

import lombok.Builder;
import lombok.Data;

/**
 * 用户
 *
 * @author chenzihan
 * @date 2021/12/22
 */
@Data
@Builder
public class User {
    private String name;
    private int age;
}
