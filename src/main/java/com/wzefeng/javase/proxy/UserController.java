package com.wzefeng.javase.proxy;

import java.lang.reflect.Proxy;

/**
 * @author wangzefeng
 * @date 2019/5/13 15:53
 */
public class UserController {


    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        ProxyHandler proxyHandler = new ProxyHandler(userService);

        UserService proxyUserService = (UserService) Proxy.newProxyInstance(proxyHandler.getClass().getClassLoader(), userService.getClass().getInterfaces(), proxyHandler);

        proxyUserService.addUser("张三", "123456");

    }
}
