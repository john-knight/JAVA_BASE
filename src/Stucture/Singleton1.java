package Stucture;

public class Singleton1 {
   private Singleton1(){
   }
   private  static  Singleton1 instance;
   public Singleton1 getInstance(){
     if (instance==null){
         synchronized (Singleton1.class){
             instance = new Singleton1();
         }
     }
     return  instance;
   }
}
