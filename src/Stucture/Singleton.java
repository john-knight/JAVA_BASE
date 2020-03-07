package Stucture;

public class Singleton {

 private Singleton(){
 }

 private static  Singleton intance = new Singleton();

 public static  Singleton getSingleton(){
     return intance;
 }

}
