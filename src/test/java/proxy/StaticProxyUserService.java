package proxy;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/27 16:25
 * @description: TODO
 */
public class StaticProxyUserService implements UserDao{

    private UserDao target;

    public StaticProxyUserService(UserDao target) {
        this.target = target;
    }

    @Override
    public void save(Integer i,String s) {
        System.out.println("开始事务");
        target.save(i,s);
        System.out.println("关闭事务");
    }
}
