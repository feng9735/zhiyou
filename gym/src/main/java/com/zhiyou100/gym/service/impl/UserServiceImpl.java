package com.zhiyou100.gym.service.impl;

import com.zhiyou100.gym.mapper.UserMapper;
import com.zhiyou100.gym.pojo.GymUser;
import com.zhiyou100.gym.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<GymUser> findAll() {
        return null;
    }

    @Override
    public GymUser findById(Integer id) {
        return null;
    }

    @Override
    public String deleteById(Integer id) {
        return null;
    }

    @Override
    public String add(GymUser user) {
        return null;
    }

    @Override
    public String update(GymUser user) {
        return null;
    }

    @Override
    public GymUser findByAccount(String account) {
        return userMapper.findByAccount(account);
    }

    @Override
    public String isSuccess(GymUser user) {
        if (user == null || user.getUAccount().length() <= 0) {
            return "账号不能为空";
        }
        if (user.getUPassword().length() <= 0) {
            return "密码不能为空";
        }
        GymUser user2 = userMapper.findByAccount(user.getUAccount());
        if (user2 == null) {
            return "账号不正确";
        }
        if (!user.getUPassword().equals(user2.getUPassword())) {
            return "密码不正确";
        }
        return "登录成功";
    }
}
