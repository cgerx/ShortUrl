package cn.xconfig.dto;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * Title:
 * Description:
 * Project: ShortUrl
 * Author: cg
 * Create Time:2018/8/15 22:27
 */
public abstract class BaseDto implements Serializable{

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
