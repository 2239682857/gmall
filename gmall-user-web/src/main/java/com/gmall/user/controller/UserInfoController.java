package com.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gmall.bean.UserInfo;
import com.gmall.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 流星紫蝶雨
 * @create 2019/2/7-14:53
 */
@RestController
public class UserInfoController {
    @Reference
    private UserInfoService userInfoService;
    @RequestMapping(value = "selectUserInfoAll",method = RequestMethod.GET)
    public List<UserInfo> selectUserInfoAll(){
        return userInfoService.selectUserInfoAll();
    }
}
