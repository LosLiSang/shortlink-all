/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package top.lisang.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;

import top.lisang.admin.dao.entity.UserDO;
import top.lisang.admin.dto.resp.UserActualRespDTO;
import top.lisang.admin.dto.resp.UserRespDTO;

/**
 *
 * @author root
 */
public interface UserService extends IService<UserDO> {
    UserRespDTO getUserByUsername(String username);

    UserActualRespDTO getActualUserByUsername(String username);

    Boolean hasUsername(String username);
}
