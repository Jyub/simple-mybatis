package mybatis.mapper;

import mybatis.model.Country;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/23 12:07
 * @description: 测试
 */
public class CountryMapperTest {

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

    @Test
    public void testSelectAll(){
        SqlSession sqlSession = sqlSessionFactory.openSession();


        List<Country> countryList = sqlSession.selectList("selectAll");

        printAll(countryList);
    }

    private static void printAll(List<Country> list){
        list.forEach(item->{
            System.out.printf("%-4d%4s%4s\n",item.getId(),item.getCountryname(),item.getCountrycode());
        });

    }
}
