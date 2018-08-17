package cn.xconfig.service;

import cn.xconfig.dto.Result;
import cn.xconfig.dto.WebUserRegDto;
import cn.xconfig.mapper.IWebUserMapper;
import cn.xconfig.pojo.WebUser;
import cn.xconfig.service.inter.IWebUserService;
import cn.xconfig.tool.CryptoTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Title:
 * Description:
 * Project: ShortUrl
 * Author: cg
 * Create Time:2018/8/15 22:18
 */
@Service
public class WebUserServiceImpl implements IWebUserService {

    @Autowired
    private IWebUserMapper iWebUserMapper;

    @Override
    public Result login(WebUserRegDto info) {
        return null;
    }


    @Override
    @Transactional
    public WebUser reg(WebUserRegDto info) {
        checkReg(info);
        WebUser webUser = new WebUser(info);
        webUser.setPassword(CryptoTool.encodePassword(info.getPassword()));
        iWebUserMapper.insert(webUser);
        System.out.println(webUser.getId());
        return null;
    }


    public void checkReg(WebUserRegDto info) {
        //TODO:校验用户信息

    }
}
