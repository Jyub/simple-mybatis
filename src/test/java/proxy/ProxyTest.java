package proxy;

import org.junit.Test;
import org.springframework.cglib.core.DebuggingClassWriter;

import java.lang.reflect.Proxy;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/27 16:27
 * @description: TODO
 */
public class ProxyTest {

    @Test
    public void testStatic() {
        UserDao target = new UserService();
        StaticProxyUserService proxy = new StaticProxyUserService(target);
        proxy.save(1,"hello");
    }

    @Test
    public void testJdkProxy(){
        UserDao target = new UserService();
        System.out.println(target.getClass());
        ProxyFactory factory = new ProxyFactory(target);
        factory.toString();
        UserDao proxy = (UserDao)factory.getProxyInstance();
        System.out.println(proxy.getClass());
        proxy.save(1,"hello");
    }

    @Test
    public void testCglibProxy(){
        UserServiceImpl target = new UserServiceImpl();
        System.out.println(target.getClass());
        CglibProxyFactory factory = new CglibProxyFactory(target);
        UserServiceImpl proxy = (UserServiceImpl) factory.getProxyInstance();
        System.out.println(proxy.getClass());
        System.out.println(proxy.toString());
        proxy.update();
        proxy.delete();
        proxy.select();
        proxy.save();
    }
}
