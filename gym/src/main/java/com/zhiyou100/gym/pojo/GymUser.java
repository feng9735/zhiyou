package com.zhiyou100.gym.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@TableName("gym_user")

public class GymUser {
    public static final String TABLENAME = "gym_user";
    @TableId(value = "u_id",type = IdType.AUTO)
    private Integer uId;
    @TableField("u_num")
    private Integer uNum;
    @TableField("u_account")
    private String uAccount;
    @TableField("u_password")
    private String uPassword;
    @TableField("u_create_time")
    private Date uCreateTime;
    @TableField("u_logout_time")
    private Date uLogoutTime;
    @TableField("balance")
    private Integer balance;
    @TableField("u_status")
    private String uStatus;
}
