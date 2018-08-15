package cn.xconfig.controller;

import cn.xconfig.pojo.Surl;
import cn.xconfig.service.UrlService;
import cn.xconfig.tool.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Title:
 * Description:
 * Project: ShortUrl
 * Author: cg
 * Create Time:2018/8/12 22:18
 */
@RestController
public class UrlController {

    @Autowired
    private UrlService urlService;


    /**
     * 生成短链接
     *
     * @param url
     * @return
     */
    @RequestMapping(value = "/u", method = RequestMethod.POST)
    public Result insertSurl(@RequestParam("url") String url) {
        Assert.hasLength(url, "网址不能为空！");
        Surl surl = urlService.generateCode(url);
        return Result.success().addData("code", surl.getCode());
    }


    /**
     * 根据短链接跳转
     *
     * @param code
     * @return
     */
    @RequestMapping(value = "/u/{code}", method = RequestMethod.GET)
    public ModelAndView select(@PathVariable String code) {
        System.out.println(code);
        Surl surl = urlService.selectByCode(code);
        return new ModelAndView("redirect:" + surl.getUrl());
    }

}
