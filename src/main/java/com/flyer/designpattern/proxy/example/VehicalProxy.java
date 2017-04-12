package com.flyer.designpattern.proxy.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by xingzhan on 2017/4/12.
 */
public class VehicalProxy {
    private Car vehical;

    public VehicalProxy(Car vehical) {
        this.vehical = vehical;
    }

    public IVehical create() {
        return (IVehical) Proxy.newProxyInstance(Car.class.getClassLoader(), new Class[] { Car.class }, new InvocationHandler() {
            @Override public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("before car running, do something");
                Object obj = method.invoke(vehical,args);
                System.out.println("after car running, do something");
                return obj;
            }
        });
    }


}
