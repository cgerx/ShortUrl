package cn.xconfig.sql;

import cn.xconfig.pojo.BasePojo;
import cn.xconfig.pojo.Surl;
import cn.xconfig.sql.BaseSQLProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;

/**
 * Title:
 * Description:
 * Project: ShortUrl
 * Author: cg
 * Create Time:2018/8/16 17:11
 */
public interface IBaseMapper<T extends BasePojo> {


    /**
     * 插入
     *
     * @param t
     * @return
     */
    @InsertProvider(type = BaseSQLProvider.class, method = "insert")
    @Options(useGeneratedKeys = true)
    int insert(T t);
}
