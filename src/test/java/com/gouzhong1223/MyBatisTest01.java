package com.gouzhong1223;

import org.apache.ibatis.domain.Person;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapper.PersonMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description : TODO
 * @Date : create by QingSong in 2020-03-14 11:05 上午
 * @Email : gouzhong1223@gmail.com
 * @Since : JDK 1.8
 * @PackageName : com.gouzhong1223
 * @ProjectName : mybatis
 * @Version : 1.0.0
 */
public class MyBatisTest01 {


  @Test
  public void test01(){

    String resources = "mybatis-config.xml";
    try {
      InputStream inputStream = Resources.getResourceAsStream(resources);
      SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
      PersonMapper mapper = build.openSession().getMapper(PersonMapper.class);
      Person person = mapper.selectByPrimaryKey(1);
      System.out.println(person);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
