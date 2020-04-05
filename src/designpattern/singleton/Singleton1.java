package designpattern.singleton;
/**
* @Description:    饿汉式
* @Author:          cjl
* @CreateDate:     2020/4/5 20:57
* @UpdateUser:
* @UpdateDate:     2020/4/5 20:57
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class Singleton1 {
    private   static   Singleton1 singleton1 = new Singleton1();
    private Singleton1(){}

    public static Singleton1 getSingleton1() {
        return singleton1;
    }
}
