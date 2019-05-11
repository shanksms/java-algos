package threadpoolexecutor;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ThreadPool {
  private BlockingQueue<Runnable> taskQueue;
  private int poolSize;

  public ThreadPool(int poolSize) {
    this.poolSize = poolSize;
    taskQueue = new LinkedBlockingQueue<>();
    for (int i = 0; i < poolSize; i++) {
      new Thread(new TaskExecutor(taskQueue)).start();
    }
  }

  public void submit(Runnable task) {
    taskQueue.offer(task);

  }

}
