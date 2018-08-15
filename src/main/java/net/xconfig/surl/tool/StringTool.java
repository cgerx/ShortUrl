package net.xconfig.surl.tool;

import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * Title:
 * Description:
 * Project: ShortUrl
 * Author: cg
 * Create Time:2018/8/13 11:32
 */
public class StringTool {


    /**
     * 平均分割
     *
     * @param str
     * @param num
     * @return
     */
    public static List<String> splitAvg(String str, int num) {
        Assert.isTrue(num > 0, "分割数量必须大于0！");
        Assert.isTrue(str.length() % num == 0, "字符串长度必须为分割份数的倍数！");
        List<String> subList = new ArrayList<>();
        int subLength = str.length() / num;
        for (int i = 0; i < num; i++) {
            String subStr = str.substring(i * subLength, i * subLength + subLength);
            subList.add(subStr);
        }
        return subList;
    }

}
