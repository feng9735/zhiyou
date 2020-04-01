package com.zhiyou100.gym.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhiyou100.gym.pojo.GymUser;

public interface UserMapper extends BaseMapper<GymUser> {

    /*根据账号查询*/
    public GymUser findByAccount(String account);

}
