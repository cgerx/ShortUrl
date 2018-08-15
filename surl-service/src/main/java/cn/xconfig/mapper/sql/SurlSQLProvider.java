package cn.xconfig.mapper.sql;

import cn.xconfig.pojo.Surl;
import org.apache.ibatis.jdbc.SQL;

/**
 * Title:
 * Description:
 * Project: ShortUrl
 * Author: cg
 * Create Time:2018/8/15 16:43
 */
public class SurlSQLProvider {


    public String selectByCode(String code){
        SQL sql = new SQL()
                .SELECT("*")
                .FROM(Surl.TABLENAME)
                .WHERE("isDelete = 0")
                .WHERE("code = #{code}");
        return sql.toString();
    }


    public String countCode(String code){
        SQL sql = new SQL()
                .SELECT("count(*)")
                .FROM(Surl.TABLENAME)
                .WHERE("isDelete = 0")
                .WHERE("code = #{code}");
        return sql.toString();
    }


    public String insert(final Surl surl){
        SQL sql = new SQL()
                .INSERT_INTO(Surl.TABLENAME)
                .VALUES("url", "#{url}")
                .VALUES("code", "#{code}")
                .VALUES("createDate", "#{createDate}")
                .VALUES("isDelete", "#{delete}");
        if (surl.getExpireDate() != null){
            sql.VALUES("expireDate", "#{expireDate}");
        }
        return sql.toString();
    }
}
