package mybatis.demotest;

import mybatis.mapper.UserMapper;
import mybatis.model.SysRole;
import mybatis.model.SysUser;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/24 13:07
 * @description: 用户mapper测试
 */
public class UserMapperTest extends BaseMapperTest{

    @Test
    public void testSelectById(){
        SqlSession sqlSession = getSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        SysUser sysUser = mapper.selectById(1L);
        Assert.assertNotNull(sysUser);
        Assert.assertEquals("admin",sysUser.getUserName());
    }

    @Test
    public void testSelectAll(){
        SqlSession sqlSession = getSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<SysUser> userList = mapper.selectAll();
        Assert.assertNotNull(userList);
        Assert.assertTrue(userList.size() > 0);
    }

    @Test
    public void testSelectRoleByUserId(){
        SqlSession sqlSession = getSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<SysRole> roleList = mapper.selectRoleByUserId(1L);
        Assert.assertNotNull(roleList);
        Assert.assertTrue(roleList.size() > 0);
        roleList.stream().forEach(role->
                System.out.println(role.getUser().getUserName()));
    }



    @Test
    public void testInsert(){
        SysUser user = new SysUser();
        user.setUserName("test3");
        user.setUserPassword("123456");
        user.setUserMail("test3@myabtis.tk");
        user.setUserInfo("测试用户");
        user.setHeadImg(new byte[]{1,2,3});
        user.setCreateTime(new Date());

        SqlSession sqlSession = getSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.insert2(user);
        Assert.assertTrue(i > 0);
        System.out.println(i+"==="+user.getId());
        //sqlSession 不会自动提交，需手动提交
        sqlSession.rollback();
    }

    @Test
    public void testUpdate(){

        SqlSession sqlSession = getSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        SysUser user = mapper.selectById(1005L);
        Assert.assertNotNull(user);
        user.setUserPassword("234567");
        int i = mapper.update(user);
        Assert.assertTrue(i > 0);
        System.out.println(i+"==="+user.getId());
        //sqlSession 不会自动提交，需手动提交
        sqlSession.rollback();
    }

    @Test
    public void testDelete(){

        SqlSession sqlSession = getSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        SysUser user = mapper.selectById(1L);
        Assert.assertNotNull(user);
        int i = mapper.deleteById(1L);
        Assert.assertTrue(i == 1);
        user = mapper.selectById(1L);
        Assert.assertNull(user);
        //sqlSession 不会自动提交，需手动提交
        sqlSession.rollback();
    }
}
