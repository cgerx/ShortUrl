package cn.xconfig.mapper;

import cn.xconfig.mapper.sql.SurlSQLProvider;
import cn.xconfig.pojo.Surl;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;

@Mapper
public interface SurlMapper {

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


    /**
     * 插入
     *
     * @param record
     * @return
     */
    @InsertProvider(type = SurlSQLProvider.class, method = "insert")
    int insert(Surl record);

}