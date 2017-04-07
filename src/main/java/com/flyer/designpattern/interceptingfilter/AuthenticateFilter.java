package com.flyer.designpattern.interceptingfilter;

/**
 * Created by xingzhan on 2017/4/7.
 */
public class AuthenticateFilter implements Processor {

    private Processor processor;

    public AuthenticateFilter(Processor processor) {
        this.processor = processor;
    }

    @Override public void execute() throws Exception {
        System.out.println("authenticate pass");
        processor.execute();
    }
}
