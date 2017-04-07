package com.flyer.designpattern.interceptingfilter;

/**
 * Created by xingzhan on 2017/4/7.
 */
public class FilterManager {

    private Processor target;

    private FilterPipeline pipeline;

    public FilterManager(Processor target, FilterPipeline pipeline) {
        this.target = target;
        this.pipeline = pipeline;
    }

    public void processFilter() {
        pipeline.processFilter();
        try {
            target.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
