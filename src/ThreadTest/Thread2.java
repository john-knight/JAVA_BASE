package ThreadTest;
//通过实现runable接口来实现多线程
//此种方式可以避免java单继承的局限推荐使用这种方式
public class Thread2 implements Runnable{
    public void run(){
        for(int i=0;i<10;i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args){
//        此处实现runable接口的类需要被Thread类包装后使用
//        Thread2类负责真正的业务部分，而Thread类负责业务调度和资源管理
        Thread2 thread2=new Thread2();
        Thread thread1=new Thread(thread2);
        thread1.start();
    }

}
