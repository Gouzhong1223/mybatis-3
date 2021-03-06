package org.apache.ibatis.mapper;

import org.apache.ibatis.domain.Person;

public interface PersonMapper {
  int deleteByPrimaryKey(Integer id);

  int insert(Person record);

  int insertSelective(Person record);

  Person selectByPrimaryKey(Integer id);

  int updateByPrimaryKeySelective(Person record);

  int updateByPrimaryKey(Person record);
}
