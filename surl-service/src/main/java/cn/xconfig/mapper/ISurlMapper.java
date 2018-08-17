package cn.xconfig.mapper;

import cn.xconfig.sql.SurlSQLProvider;
import cn.xconfig.pojo.Surl;
import cn.xconfig.sql.IBaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;

@Mapper
public interface ISurlMapper extends IBaseMapper<Surl> {

    /**
     * 统计code出现的次数
     *
     * @param code
     * @return
     */
    @SelectProvider(type = SurlSQLProvider.class, method = "countCode")
    int countCode(String code);


    /**
     * 根据code检索
     *
     * @param code
     * @return
     */
    @SelectProvider(type = SurlSQLProvider.class, method = "selectByCode")
    Surl selectByCode(String code);


}