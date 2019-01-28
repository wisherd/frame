package com.cloud.util;

/**
 * @Description TODO
 * @Author kehun
 * @Date 2019/1/3 00039:17
 */
public class Singleton {

    private Singleton(){}

    private static class SingletonFactory{
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonFactory.instance;
    }

}
