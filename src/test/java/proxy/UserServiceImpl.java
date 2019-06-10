package proxy;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/28 14:41
 * @description: 未实现接口类
 */
public class UserServiceImpl {

    public void save(){
        System.out.println("======已保存数据=======");
    }

    public final void update(){
        System.out.println("======已修改数据=======");
    }

    public static void delete(){
        System.out.println("======已删除数据=======");
    }

    public static final void select(){
        System.out.println("======已查询数据=======");
    }
}
