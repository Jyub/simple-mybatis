package proxy;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/27 16:24
 * @description: TODO
 */
public class UserService implements UserDao{
    @Override
    public void save(Integer i,String s) {
        System.out.println("=====数据已保存======");
    }
}
