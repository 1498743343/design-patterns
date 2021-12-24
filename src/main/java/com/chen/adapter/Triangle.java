package com.chen.adapter;

/**
 * 三角形: 现在已有三角形的 draw 方法, 但是和 shapre 中的 darw 不匹配, 所以我们需要创建三角形的适配器来适配 shape 接口
 *
 * @author chenzihan
 * @date 2021/12/24
 */
public class Triangle {
    public void draw(String corlor, String paper) {
        System.out.println("在" + paper + "上画" + corlor + "的三角形");
    }
}
