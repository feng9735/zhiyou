package com.zhiyou100.gym.controller;

import com.zhiyou100.gym.pojo.GymUser;
import com.zhiyou100.gym.pojo.ResponseModel;
import com.zhiyou100.gym.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j
@Controller
@RequestMapping("user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "login",method= RequestMethod.POST)
    public String login(GymUser user,ResponseModel responseModel, Model model){
        log.info(user.getUAccount()+"----------------"+user.getUPassword());
        /*判断账号是否为空*/
        if (user.getUAccount()==null||user.getUAccount().length()==0){
            model.addAttribute("msg",responseModel.ERROR_MSG_1);
            return "login";
        }
        /*判断密码是否为空*/
        if (user.getUPassword()==null||user.getUPassword().length()==0){
            return responseModel.ERROR_MSG_2;
        }

        String msg = userService.isSuccess(user);
        if (!msg.equals("登录成功")) {
            return ResponseModel.ERROR_MSG_3;
        }else {
            GymUser user1 = userService.findByAccount(user.getUAccount());
            log.info("num"+user1.getUNum());
            model.addAttribute("userNum",user1.getUNum());
            return "/view/user/success";
        }
    }

}
