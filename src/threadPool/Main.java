package threadPool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static int count = 0;

    public static synchronized void addCount() {
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(list.toArray());
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        ExecutorService myExcutorService = new ThreadPoolExecutor(2, 4, 1,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(8));
        for (int k = 0; k < 12; k++) {
            myExcutorService.submit(
                    new Runnable() {
                        @Override
                        public void run() {
                            Main.addCount();
                        }
                    });
        }
    }
}
