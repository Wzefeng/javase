package com.wzefeng.javase.shejimoshi;

/**
 * 饿汉式实现单例模式
 * 线程安全
 *
 * @author wangzefeng
 * @date 2019/5/10 15:39
 */
public class Singleton1 {

    private Singleton1() {
    }

    private final static Singleton1 instance = new Singleton1();

    public static Singleton1 getInstance() {
        return instance;
    }
}
