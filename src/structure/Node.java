package structure;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Node {
    Integer value;
    Node next;

    public Node(int value) {
        this.value = value;
    }

    public void add() {
        lock.lock();
        try {

        } finally {
            lock.unlock();
        }
    }

    Lock lock = new ReentrantLock();


    public static void main(String[] args) {
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor();
//        threadPoolExecutor.submit(new Thread());
    }
}
