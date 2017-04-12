package com.flyer.designpattern.proxy.example;

/**
 * Exception in thread "main" java.lang.IllegalArgumentException: com.flyer.designpattern.proxy.example.Car is not an interface
 at java.lang.reflect.Proxy$ProxyClassFactory.apply(Proxy.java:590)
 at java.lang.reflect.Proxy$ProxyClassFactory.apply(Proxy.java:557)
 at java.lang.reflect.WeakCache$Factory.get(WeakCache.java:230)
 at java.lang.reflect.WeakCache.get(WeakCache.java:127)
 at java.lang.reflect.Proxy.getProxyClass0(Proxy.java:419)
 at java.lang.reflect.Proxy.newProxyInstance(Proxy.java:719)
 at com.flyer.designpattern.proxy.example.VehicalProxy.create(VehicalProxy.java:18)
 at com.flyer.designpattern.proxy.example.Main.main(Main.java:11)
 at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
 at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
 at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
 at java.lang.reflect.Method.invoke(Method.java:497)
 at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
 */
public class Main {

    public static void main(String[] args) {
        Car vehical = new Car();
        VehicalProxy proxy = new VehicalProxy(vehical);
        IVehical proxyObj = proxy.create();
        proxyObj.run();

    }
}
