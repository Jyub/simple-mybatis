package proxy;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/28 15:12
 * @description: TODO
 */
public class MyMethodInterceptor implements MethodInterceptor{
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib开始事务1");
        Object invoke = methodProxy.invokeSuper(o, objects);
        System.out.println("Cglib结束事务2");
        return invoke;
    }
}
