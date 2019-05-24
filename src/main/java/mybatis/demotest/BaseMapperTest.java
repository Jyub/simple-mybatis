package mybatis.demotest;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;

import java.io.IOException;
import java.io.Reader;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/24 13:04
 * @description: mapper 测试基类
 */
public class BaseMapperTest {

    private static SqlSessionFactory sqlSessionFactory;

    @BeforeClass
    public static void init(){
        try {
            Reader reader = Resources.getResourceAsReader("mybatis/mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSession(){
        return sqlSessionFactory.openSession();
    }
}
