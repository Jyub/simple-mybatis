package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/27 17:25
 * @description: TODO
 */
public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                (proxy, method,args)->{
                    System.out.println(proxy.getClass());
                    System.out.println("开始事务");
                    Object returnValue = method.invoke(target, args);
                    System.out.println("关闭事务");
                    return returnValue;
                });
    }

    public String toString(){
        Object reVal = null;
        ProxyFactory factory = new ProxyFactory(new Object());
        try {
            Method method = factory.getClass().getMethod("toString", null);
            reVal = method.invoke(factory,method,null);
        }catch (Exception e){

        }
        return (String) reVal;
    }
}
