package cn.xconfig.service;

import cn.xconfig.constants.Constants;
import cn.xconfig.exception.SurlException;
import cn.xconfig.mapper.ISurlMapper;
import cn.xconfig.pojo.Surl;
import cn.xconfig.tool.MD5Tool;
import cn.xconfig.tool.StringTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Title:
 * Description:
 * Project: ShortUrl
 * Author: cg
 * Create Time:2018/8/13 11:26
 */
@Service
public class UrlService {

    @Autowired
    private ISurlMapper surlMapper;

    /**
     * 生成CODE
     * @param url
     * @return
     */
    public Surl generateCode(String url){
        if (!url.startsWith("http")){
            url = "http://" + url;
        }
        List<String> list = generateList(url);
        for (String code : list) {
            int count = surlMapper.countCode(code);
            if (count == 0){
                Surl surl = new Surl();
                surl.setCode(code);
                surl.setUrl(url);
                surlMapper.insert(surl);
                return surl;
            }
        }
        throw new SurlException("生成短链接失败！");
    }



    /**
     * 生成code数组
     *
     * @param url
     * @return
     */
    public List<String> generateList(String url) {
        String md5 = MD5Tool.md5(url);
        List<String> subMd5List = StringTool.splitAvg(md5, 4);
        List<String> resList = new ArrayList<>();
        for (String hex : subMd5List) {
            String outChars = "";
            long hexLong = 0X3FFFFFFF & Long.parseLong(hex, 16);
            for (int i = 0; i < 6; i++) {
                long index = hexLong & 0X0000003D;
                char ch = Constants.chars[(int) index];
                outChars += ch;
                hexLong = hexLong >> 5;
            }
            resList.add(outChars);
        }
        return resList;
    }


    public Surl selectByCode(String code) {
        return surlMapper.selectByCode(code);
    }
}
