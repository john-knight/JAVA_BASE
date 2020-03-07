package Threadsecurity;
//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;
//public class Main {
//    public static void main(String[] args) {
//        Lock lock = new ReentrantLock();
//        Main main = new Main();
//
//    }
//
//}
import java.util.Scanner;

public  class Main{
    public static void main(String[] args){
        int arr[][] =new int[][]{};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum[] =new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum[i]+=arr[j][i];
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(sum[i]>max);
            max=sum[i];
        }
        System.out.println(max);
    }
}

