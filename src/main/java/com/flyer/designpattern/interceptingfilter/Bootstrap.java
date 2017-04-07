package com.flyer.designpattern.interceptingfilter;

/**
 * Created by xingzhan on 2017/4/7.
 */
public class Bootstrap {

    public static void main(String[] args) {
        Processor processor = new DebuggingFilter(new AuthenticateFilter(new CoreProcessor()));
        try {
            processor.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("****************************");

        Processor target = new CoreProcessor();
        FilterPipeline pipeline = new FilterPipeline();
        pipeline.addLast(new AuditFilter());
        pipeline.addFirst(new LoginFilter());
        pipeline.addLast(new DebugFilter());

        FilterManager filterManager = new FilterManager(target, pipeline);
        filterManager.processFilter();
    }
}
