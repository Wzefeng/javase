package com.wzefeng.javase.proxy;

/**
 * @author wangzefeng
 * @date 2019/5/13 15:52
 */
public class UserServiceImpl implements UserService {
    @Override
    public void addUser(String userName, String password) {
        System.out.println("用户：" + userName + ", 密码：" + password + "添加成功");
    }
}
