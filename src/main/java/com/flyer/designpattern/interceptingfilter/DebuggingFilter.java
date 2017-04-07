package com.flyer.designpattern.interceptingfilter;

/**
 * Created by xingzhan on 2017/4/7.
 */
public class DebuggingFilter implements Processor {

    private Processor processor;

    public DebuggingFilter(Processor processor) {
        this.processor = processor;
    }

    @Override public void execute() throws Exception {
        System.out.println("debugging");
        processor.execute();
        System.out.println("post debugging completed");
    }
}
