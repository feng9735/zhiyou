package com.zhiyou100.gym.service;

import com.zhiyou100.gym.pojo.GymUser;

import java.util.List;

public interface UserService {
    public List<GymUser> findAll();
    public GymUser findById(Integer id);
    public String deleteById(Integer id);
    public String add(GymUser user);
    public String update(GymUser user);
    public GymUser findByAccount(String account);
    public String isSuccess(GymUser user);
}
