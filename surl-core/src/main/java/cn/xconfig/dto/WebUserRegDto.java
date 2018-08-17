package cn.xconfig.dto;

import cn.xconfig.constants.PatternConst;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Title:
 * Description:
 * Project: ShortUrl
 * Author: cg
 * Create Time:2018/8/15 21:58
 */
public class WebUserRegDto extends BaseDto{

    @NotNull(message = "用户名不能为空！")
    @Length(min = 6, max = 16, message = "用户名长度应为6~16")
    @Pattern(regexp = PatternConst.NUMBER_AND_LETTER, message = "用户名只能由以字母开头的数字大小写字母及_组成")
    private String username;

    @NotNull(message = "密码不能为空")
    @Length(min = 8, max = 16, message = "密码长度应为6~16")
    private String password;

    @NotNull(message = "手机号不能为空！")
    @Pattern(regexp = PatternConst.TELEPHONE, message = "手机号格式错误！")
    private String telephone;

    @NotNull(message = "邮箱不能为空！")
    @Pattern(regexp = PatternConst.EMAIL, message = "邮箱格式错误!")
    private String email;

    private String qq;

    private String wechat;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

}
