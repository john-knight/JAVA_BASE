package base;

import java.util.*;

public class Main {
    public static volatile int i = 0;

    public static void add() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Main.i++;
    }

    static public void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                public void run() {
                    add();
                }
            }).start();
        }
        String s = "hello";
        StringBuffer stringBuffer = new StringBuffer(s);

        Main main = new Main();
        System.out.println(main.toString());
        System.out.println(stringBuffer.substring(0, 1));
        System.out.println(8 & 1);
        Thread.sleep(1000);
        System.out.println(i);
   Map map1 = new HashMap();
   ThreadLocal threadLocal = new ThreadLocal();
   threadLocal.set(map1);
    }}

