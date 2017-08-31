package com.cobra.mapper;

import com.cobra.pojo.Zduser;
import com.cobra.pojo.ZduserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZduserMapper {
    long countByExample(ZduserExample example);

    int deleteByExample(ZduserExample example);

    int deleteByPrimaryKey(String username);

    int insert(Zduser record);

    int insertSelective(Zduser record);

    List<Zduser> selectByExample(ZduserExample example);

    Zduser selectByPrimaryKey(String username);

    int updateByExampleSelective(@Param("record") Zduser record, @Param("example") ZduserExample example);

    int updateByExample(@Param("record") Zduser record, @Param("example") ZduserExample example);

    int updateByPrimaryKeySelective(Zduser record);

    int updateByPrimaryKey(Zduser record);
}