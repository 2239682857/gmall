package com.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gmall.bean.UserInfo;
import com.gmall.service.UserInfoService;
import com.gmall.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author 流星紫蝶雨
 * @create 2019/2/7-14:50
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;


    @Override
    public List<UserInfo> selectUserInfoAll() {
        return userInfoMapper.selectAll();
    }
}
