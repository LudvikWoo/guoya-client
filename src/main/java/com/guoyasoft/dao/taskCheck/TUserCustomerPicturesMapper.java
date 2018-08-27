package com.guoyasoft.dao.taskCheck;

import com.guoyasoft.bean.db.taskCheck.TUserCustomerPictures;
import com.guoyasoft.bean.db.taskCheck.TUserCustomerPicturesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserCustomerPicturesMapper {
    long countByExample(TUserCustomerPicturesExample example);

    int deleteByExample(TUserCustomerPicturesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TUserCustomerPictures record);

    int insertSelective(TUserCustomerPictures record);

    List<TUserCustomerPictures> selectByExample(TUserCustomerPicturesExample example);

    TUserCustomerPictures selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TUserCustomerPictures record, @Param("example") TUserCustomerPicturesExample example);

    int updateByExample(@Param("record") TUserCustomerPictures record, @Param("example") TUserCustomerPicturesExample example);

    int updateByPrimaryKeySelective(TUserCustomerPictures record);

    int updateByPrimaryKey(TUserCustomerPictures record);
}