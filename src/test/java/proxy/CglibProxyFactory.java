package proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/28 14:23
 * @description: Cglib代理工厂
 */
public class CglibProxyFactory implements MethodInterceptor{

    private Object target;

    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        Enhancer en = new Enhancer();
        //设置父类
        en.setSuperclass(target.getClass());
        //设置回调方法
        en.setCallback(new MyMethodInterceptor());
        return en.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib开始事务");
        Object invoke = methodProxy.invoke(target, objects);
        System.out.println("Cglib结束事务");
        return invoke;
    }
}
