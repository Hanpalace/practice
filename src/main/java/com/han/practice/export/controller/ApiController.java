package com.han.practice.export.controller;

import com.han.practice.export.po.TUser;
import com.han.practice.export.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ycy
 */
@RestController
@RequestMapping("/api/")
public class ApiController {

    @Autowired
    private TUserService tUserService;

    /**
     *
     * @return
     */
    @RequestMapping("queryUser")
    public TUser queryUser(@RequestParam(value = "userId") String userId) {
        return tUserService.getById(userId);
    }
}
