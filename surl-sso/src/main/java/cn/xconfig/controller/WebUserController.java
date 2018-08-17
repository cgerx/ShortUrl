package cn.xconfig.controller;

import cn.xconfig.dto.Result;
import cn.xconfig.dto.WebUserRegDto;
import cn.xconfig.pojo.WebUser;
import cn.xconfig.redis.impl.WebUserRedisService;
import cn.xconfig.service.inter.IWebUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Title:前台用户管理
 * Description:
 * Project: ShortUrl
 * Author: cg
 * Create Time:2018/8/15 18:46
 */
@RestController()
public class WebUserController {

    @Autowired
    WebUserRedisService webUserRedisService;

    @Autowired
    IWebUserService iWebUserService;

    @RequestMapping("login")
    public Result login(@Valid WebUserRegDto info, BindingResult bindingResult) {


        return null;
    }


    @RequestMapping("reg")
    public Result reg(@Valid WebUserRegDto info, BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            return Result.fail(bindingResult.getAllErrors().get(0).getDefaultMessage());
        }
        iWebUserService.reg(info);
        return Result.success();
    }
}
