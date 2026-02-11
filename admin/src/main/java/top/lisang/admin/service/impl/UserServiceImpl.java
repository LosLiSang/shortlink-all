/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package top.lisang.admin.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import top.lisang.admin.common.convention.exception.ClientException;
import top.lisang.admin.common.enums.UserErrorCodeEnum;
import top.lisang.admin.dao.entity.UserDO;
import top.lisang.admin.dao.mapper.UserMapper;
import top.lisang.admin.dto.resp.UserActualRespDTO;
import top.lisang.admin.dto.resp.UserRespDTO;
import top.lisang.admin.service.UserService;

/**
 *
 * @author root
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {

    @Override
    public UserRespDTO getUserByUsername(String username) {
        LambdaQueryWrapper<UserDO> lq = Wrappers.lambdaQuery(UserDO.class).eq(UserDO::getUsername, username);
        UserDO userDO = baseMapper.selectOne(lq);
        if (userDO == null) {
            throw new ClientException(UserErrorCodeEnum.USER_NULL);
        }
        UserRespDTO userRespDTO = new UserRespDTO();
        BeanUtils.copyProperties(userDO, userRespDTO);
        return userRespDTO;
    }

    @Override
    public UserActualRespDTO getActualUserByUsername(String username) {
        LambdaQueryWrapper<UserDO> lq = Wrappers.lambdaQuery(UserDO.class).eq(UserDO::getUsername, username);
        UserDO userDO = baseMapper.selectOne(lq);
        if (userDO == null) {
            throw new ClientException(UserErrorCodeEnum.USER_NULL);
        }
        UserActualRespDTO userRespDTO = new UserActualRespDTO();
        BeanUtils.copyProperties(userDO, userRespDTO);
        return userRespDTO;
    }

    @Override
    public Boolean hasUsername(String username) {
        LambdaQueryWrapper<UserDO> lq = Wrappers.lambdaQuery(UserDO.class).eq(UserDO::getUsername, username);
        boolean exists = baseMapper.exists(lq);
        return exists;
    }

}
