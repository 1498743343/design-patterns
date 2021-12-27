package com.chen.chain;

import org.springframework.util.StringUtils;

/**
 * 参数处理程序
 *
 * @author chenzihan
 * @date 2021/12/27
 */
public class ParamsHandler implements Handler{
    public static final String BEGIN = "entry";
    @Override
    public void process(Request request) {
        String password = request.getPassword();
        if(StringUtils.hasLength(password) && password.startsWith(BEGIN)) {
            password = password.substring(password.indexOf(BEGIN) + BEGIN.length());
            request.setPassword(password);
        }
        System.out.println("paramsHandler -> " + request);
    }
}
