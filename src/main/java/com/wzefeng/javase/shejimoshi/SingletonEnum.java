package com.wzefeng.javase.shejimoshi;

/**
 * 枚举实现单例模式，线程安全，并且可以避免反射获取私有构造方法。
 *
 * @author wangzefeng
 * @date 2019/5/10 15:53
 */
public enum SingletonEnum {
    INSTANCE;
}
