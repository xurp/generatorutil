package com.example.generatorutil.dao;

import com.example.generatorutil.model.UserCopy;

public interface UserCopyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserCopy record);

    int insertSelective(UserCopy record);

    UserCopy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserCopy record);

    int updateByPrimaryKey(UserCopy record);
}