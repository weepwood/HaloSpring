package com.halo.controller;

import com.halo.entity.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;

/**
 * @author Halo
 * @create 2021/11/12 下午 03:28
 * @description
 */
@RestController
@RequestMapping("/user")
@Validated // 开启校验功能
public class UserController {
    // 简单数据类型校验
    @RequestMapping("/delete")
    public String delete(@NotBlank(message = "id 不能为空") String id) {
        System.out.println("delete..." + id);
        return "OK";
    }

    // 对象属性校验
    @RequestMapping("/save")
    public String save(@Validated User user) {
        System.out.println("save..." + user);
        return "OK";
    }
}