package cn.xconfig.pojo;

import cn.xconfig.annotation.Table;
import cn.xconfig.dto.WebUserRegDto;

import java.util.Date;

/**
 * Title:
 * Description:
 * Project: ShortUrl
 * Author: cg
 * Create Time:2018/8/15 19:58
 */
@Table(tableName = WebUser.TABLENAME)
public class WebUser extends BasePojo{

    public static final String TABLENAME = "web_user";

    private Integer id;

    private String username;

    private String password;

    private String telephone;

    private String email;

    private String qq;

    private String wechat;

    private String photo;

    private Date regDate;

    private Date lastLoginDate;

    private String lastLoginIp;

    public WebUser(){

    }

    public WebUser(WebUserRegDto regDto){
        username = regDto.getUsername();
        password = regDto.getPassword();
        telephone = regDto.getTelephone();
        email = regDto.getEmail();
        wechat = regDto.getWechat();
        qq = regDto.getQq();
        regDate = new Date();
        lastLoginDate = new Date();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }
}
