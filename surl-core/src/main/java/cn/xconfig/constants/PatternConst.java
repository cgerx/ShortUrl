package cn.xconfig.constants;

/**
 * Title:
 * Description:
 * Project: ShortUrl
 * Author: cg
 * Create Time:2018/8/15 22:30
 */
public class PatternConst {

    /**
     * 纯数字
     */
    public static final String NUMBER = "^[0-9]*$";


    /**
     * 数字+字母+下划线
     */
    public static final String NUMBER_AND_LETTER = "^[a-zA-Z]\\w*$";


    /**
     * 电话号码
     */
    public static final String TELEPHONE = "^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\\d{8}$";


    /**
     * 有效邮箱
     */
    public static final String EMAIL = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z0-9]{2,6}$";
}
