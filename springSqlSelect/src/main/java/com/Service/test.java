package com.Service;

import com.domain.t_org;
import com.mapper.query;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class test {
    private SqlSessionFactory sqlSessionFactory;
    public void SetUp() throws Exception{
        String resource = "com/mapper/SqlConfigMapp.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    public t_org doIt(String name) throws  Exception{
       SetUp();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        query query = sqlSession.getMapper(com.mapper.query.class);
       t_org t_org = query.queryInfo(name);
       return t_org;
    }
}
