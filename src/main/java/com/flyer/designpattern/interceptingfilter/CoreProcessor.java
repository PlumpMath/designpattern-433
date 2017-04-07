package com.flyer.designpattern.interceptingfilter;

/**
 * Created by xingzhan on 2017/4/7.
 */
public class CoreProcessor implements Processor {

    @Override public void execute() throws Exception {
        System.out.println("core process");
    }
}
