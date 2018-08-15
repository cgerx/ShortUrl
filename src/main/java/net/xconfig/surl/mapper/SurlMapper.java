package net.xconfig.surl.mapper;

import net.xconfig.surl.pojo.Surl;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SurlMapper {

    int countCode(String code);

    Surl selectByCode(String code);

    int deleteByPrimaryKey(Integer id);

    int insert(Surl record);

    int insertSelective(Surl record);

    Surl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Surl record);

    int updateByPrimaryKey(Surl record);
}