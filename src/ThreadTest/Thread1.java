package ThreadTest;
//通过继承Thread类来实现多线程
public class Thread1 extends  Thread{
    public Thread1(){
    }
    public void run(){
            for(int i=0;i<10;i++) {
                System.out.println(i);
            }
    }
    public static void main(String[] args){
        Thread1 thread1=new Thread1();
        Thread1 thread2=new Thread1();
        Thread1 thread3=new Thread1();
        Thread1 thread4=new Thread1();
        thread1.start();thread2.start();thread3.start();thread4.start();
    }
}
