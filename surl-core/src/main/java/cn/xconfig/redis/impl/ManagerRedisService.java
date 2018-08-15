package cn.xconfig.redis.impl;

import cn.xconfig.pojo.Manager;
import cn.xconfig.redis.IRedisService;
import org.springframework.stereotype.Service;

/**
 * Title:
 * Description:
 * Project: ShortUrl
 * Author: cg
 * Create Time:2018/8/15 19:59
 */
@Service
public class ManagerRedisService extends IRedisService<Manager>{
    @Override
    protected String getRedisKey() {
        return "MANAGER";
    }
}
