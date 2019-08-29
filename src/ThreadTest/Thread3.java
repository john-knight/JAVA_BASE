package ThreadTest;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
//通过实现callable接口并且用featuretask类二次封装来实现多线程
//需要注意，此种方式有返回值，而且核心方法为call（）方法（前两者为run（）方法），并且此方法有返回值
//需要注意，返回值类型可用泛型实现
public class Thread3  implements Callable<String> {
   public String call(){
           for(int i=0;i<10;i++) {
               System.out.println(i);
           }
       return "ok";
   }
  public static void  main(String[] args){
      Callable<String> callable=new Thread3();
//      此处可查源码，futuretask（）构造函数传入的必须为实现callable接口的类
      FutureTask<String> futureTask=new FutureTask<>(callable);
      Thread thread3 =new Thread(futureTask);
      thread3.start();
  }

}
