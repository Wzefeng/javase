package com.wzefeng.javase.shejimoshi;

import java.util.Arrays;

/**
 * 懒汉式实现单例模式
 * 需要考虑线程安全
 *
 * @author wangzefeng
 * @date 2019/5/10 15:42
 */
public class Singleton2 {

    private Singleton2() {
    }

    // 可见性，原子性（禁止指令重排序）
    private volatile static Singleton2 instance = null;

    public static Singleton2 getInstance() {
        // 双重检验锁
        if (null == instance) {
            // 互斥性
            synchronized (Singleton2.class) {
                if (null == instance) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}
