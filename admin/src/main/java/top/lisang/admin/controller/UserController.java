/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package top.lisang.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import top.lisang.admin.common.convention.Result;
import top.lisang.admin.common.convention.Results;
import top.lisang.admin.dto.resp.UserActualRespDTO;
import top.lisang.admin.dto.resp.UserRespDTO;
import top.lisang.admin.service.UserService;


/**
 *
 * @author root
 */
@RestController
@RequestMapping("/api/short-link/admin/v1/")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/user/{username}")
    public Result<UserRespDTO> getUserByUsername(@PathVariable String username) {
        return Results.success(userService.getUserByUsername(username));
    }

    @GetMapping("/actual/user/{username}")
    public Result<UserActualRespDTO> getActualUserByUsername(@PathVariable String username) {
        return Results.success(userService.getActualUserByUsername(username));
    }

    @GetMapping("/user/has-username")
    public Result<Boolean> getMethodName(@RequestParam("username") String username) {
        
        return Results.success(userService.hasUsername(username));
    }
    

}
