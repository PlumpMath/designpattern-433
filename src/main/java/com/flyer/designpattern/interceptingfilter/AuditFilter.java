package com.flyer.designpattern.interceptingfilter;

/**
 * Created by xingzhan on 2017/4/7.
 */
public class AuditFilter implements Filter {
    @Override public void execute() {
        System.out.println("audit");
    }
}
