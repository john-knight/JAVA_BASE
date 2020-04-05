package designpattern.singleton;
/**
* @Description:    懒汉式基础写法
* @Author:         cjl
* @CreateDate:     2020/4/5 20:58
* @UpdateUser:
* @UpdateDate:     2020/4/5 20:58
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class Singleton2 {
private  static  Singleton2 singleton2;
private  Singleton2(){};
public Singleton2 getSingleton2(){
    if (singleton2==null){
        singleton2 = new Singleton2();
    }
    return  singleton2;
}
}
