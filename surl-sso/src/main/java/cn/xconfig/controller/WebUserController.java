package cn.xconfig.controller;

import cn.xconfig.pojo.WebUser;
import cn.xconfig.redis.impl.WebUserRedisService;
import cn.xconfig.tool.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title:前台用户管理
 * Description:
 * Project: ShortUrl
 * Author: cg
 * Create Time:2018/8/15 18:46
 */
@RestController()
@RequestMapping("w")
public class WebUserController {

    @Autowired
    WebUserRedisService webUserRedisService;

    @RequestMapping("login")
    public Result login(WebUser webUser){


        return null;
    }
}
