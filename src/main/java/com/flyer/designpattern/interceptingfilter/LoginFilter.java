package com.flyer.designpattern.interceptingfilter;

/**
 * Created by xingzhan on 2017/4/7.
 */
public class LoginFilter implements Filter {
    @Override public void execute() {
        System.out.println("login");
    }
}
