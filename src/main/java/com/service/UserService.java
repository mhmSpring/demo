package com.service;

import com.bean.User;

import java.util.List;

public interface UserService {
    /**
     * 新增用户
     */
    public void add(User user);

    /**
     * 修改
     */
    public  void update(User user);

    /**
     * 删除
     */
    public void  delete(Long id);

    /**
     * 根据id获取用户信息
     */
    public  User fingOne(Long id);

    /**
     * 获取全部用户信息
     */
    public List<User>fingAll();


}
