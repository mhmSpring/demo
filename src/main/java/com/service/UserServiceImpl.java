package com.service;

import com.bean.User;
import com.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void add(User user) {
        userDao.save(user);

    }

    @Override
    public void update( User user) {
        userDao.saveAndFlush(user);

    }

    @Override
    public void delete(Long id) {
        userDao.deleteById(id);

    }

    @Override
    public User fingOne(Long id) {
        return userDao.findById(id).get();
    }

    @Override
    public List<User> fingAll() {
        return userDao.findAll();
    }


}
