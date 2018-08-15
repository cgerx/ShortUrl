package cn.xconfig.redis.impl;

import cn.xconfig.pojo.WebUser;
import cn.xconfig.redis.IRedisService;
import org.springframework.stereotype.Service;

/**
 * Title:
 * Description:
 * Project: ShortUrl
 * Author: cg
 * Create Time:2018/8/15 19:56
 */
@Service
public class WebUserRedisService extends IRedisService<WebUser> {
    @Override
    protected String getRedisKey() {
        return "WEB_USER";
    }
}
