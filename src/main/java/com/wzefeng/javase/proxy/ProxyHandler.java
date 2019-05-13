package com.wzefeng.javase.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author wangzefeng
 * @date 2019/5/13 15:36
 */
public class ProxyHandler implements InvocationHandler {

    // 代理目标对象
    private Object target;

    public ProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("准备添加用户...");

        Object result = method.invoke(target, args);

        System.out.println("用户添加成功！");

        return result;
    }
}
