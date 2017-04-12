package com.flyer.designpattern.proxy.cglib;

/**
 * Created by xingzhan on 2017/4/12.
 */
public class TestCglib {
    public static void main(String[] args) {
        BookFacadeCglib cglib = new BookFacadeCglib();
        BookFacadeImpl book = (BookFacadeImpl) cglib.getInstance(new BookFacadeImpl());
        book.addBook();
    }
}
