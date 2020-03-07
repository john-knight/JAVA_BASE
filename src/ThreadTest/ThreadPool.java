package ThreadTest;


import java.util.concurrent.*;

public class ThreadPool {
  public static void main(String[] args){
      BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(100);
//      拒绝策略
//      AbortPolicy     	  抛出RejectedExecutionException
//      DiscardPolicy	      什么也不做，直接忽略
//      DiscardOldestPolicy	  丢弃执行队列中最老的任务，尝试为当前提交的任务腾出位置
//      CallerRunsPolicy	  直接由提交任务者执行这个任务
      ExecutorService executorService=new ThreadPoolExecutor(1, 1, 1, TimeUnit.HOURS,queue);
//      向线程池中提交任务的方式
//      Future<T> submit(Callable<T> task)	是
//      void execute(Runnable command)	否
//      Future<?> submit(Runnable task)	否，虽然返回Future，但是其get()方法总是返回null

  }
}
