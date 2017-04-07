package com.flyer.designpattern.interceptingfilter;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by xingzhan on 2017/4/7.
 */
public class FilterPipeline {

    private List<Filter> filters = new LinkedList<>();

    public void processFilter() {
        for (Filter filter : filters) {
            try {
                filter.execute();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void removeFilter(Filter filter) {
        filters.remove(filter);
    }

    public void addFirst(Filter filter) {
        filters.add(0,filter);
    }

    public void addLast(Filter filter) {
        filters.add(filters.size(), filter);
    }
}
