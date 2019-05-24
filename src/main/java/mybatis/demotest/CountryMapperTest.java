package mybatis.demotest;

import mybatis.model.Country;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/23 12:07
 * @description: 测试
 */
public class CountryMapperTest extends BaseMapperTest{

    @Test
    public void testSelectAll(){
        SqlSession sqlSession = getSession();

        List<Country> countryList = sqlSession.selectList("selectAll");

        printAll(countryList);
    }

    private static void printAll(List<Country> list){
        list.forEach(item->{
            System.out.printf("%-4d%4s%4s\n",item.getId(),item.getCountryname(),item.getCountrycode());
        });

    }
}
