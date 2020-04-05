package designpattern.singleton;

/**
* @Description:    懒汉式线程安全写法，双重检验多线程环境下效率会更快
* @Author:         cjl
* @CreateDate:     2020/4/5 20:58
* @UpdateUser:
* @UpdateDate:     2020/4/5 20:58
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class Singleton3 {
    private Singleton3  singleton3 ;
    private Singleton3(){};
    public  Singleton3 getSingleton3(){
        if (singleton3==null){
            synchronized (this.getClass()){
                if (singleton3==null) {
                    singleton3 = new Singleton3();
                }
            }
        }
        return  singleton3;
    }

}
