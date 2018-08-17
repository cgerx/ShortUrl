package cn.xconfig.service.inter;

import cn.xconfig.dto.Result;
import cn.xconfig.dto.WebUserRegDto;
import cn.xconfig.pojo.WebUser;

/**
 * Title:
 * Description:
 * Project: ShortUrl
 * Author: cg
 * Create Time:2018/8/15 22:01
 */
public interface IWebUserService {


    Result login(WebUserRegDto info);


    WebUser reg(WebUserRegDto info);
}
