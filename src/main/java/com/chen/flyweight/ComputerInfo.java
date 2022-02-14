package com.chen.flyweight;

import com.chen.create.builder.bean.Computer;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 计算机信息: 内蕴状态就是共性，外蕴状态就是个性
 *
 * @author chenzihan
 * @date 2021/12/27
 */
@Data
@AllArgsConstructor
public class ComputerInfo {

    /**
     * id - 这个字段每个电脑都不一样, 对于这样的数据我们叫做 "外蕴状态"
     */
    private int id;
    /**
     * 电脑 - 这个字段是很多电脑都共享的数据, 对于这样的数据我们叫做 "内蕴状态"
     */
    private Computer computer;
}
