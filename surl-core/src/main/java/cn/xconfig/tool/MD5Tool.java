package cn.xconfig.tool;

import org.springframework.util.DigestUtils;

/**
 * Title:
 * Description:
 * Project: ShortUrl
 * Author: cg
 * Create Time:2018/8/13 11:01
 */
public class MD5Tool {


    public static String md5(String text){
        return md5(text, "");
    }


    public static String md5(String text, String key){
        String str = text + key;
        return DigestUtils.md5DigestAsHex(str.getBytes());
    }
}
