package cn.xconfig.pojo;

import cn.xconfig.annotation.Column;
import cn.xconfig.annotation.Table;

import java.util.Date;

/**
 * Title:
 * Description:
 * Project: ShortUrl
 * Author: cg
 * Create Time:2018/8/12 21:52
 */
@Table(tableName = Surl.TABLENAME)
public class Surl extends BasePojo{

    public static final String TABLENAME = "surl";

    private Integer id;

    private String url;

    private String code;

    private Date createDate;

    private Date expireDate;

    @Column("isDelete")
    private Boolean delete;

    public Surl(){
        createDate = new Date();
        delete = false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        delete = delete;
    }
}
