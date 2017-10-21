package com.Service;

import com.domain.movies;
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
    public movies doIt(String name) throws  Exception{
       SetUp();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        query query = sqlSession.getMapper(com.mapper.query.class);
       movies movies = query.queryInfo(name);
       return movies;
    }
}
