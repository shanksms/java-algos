package threadpoolexecutor;

import java.util.concurrent.BlockingQueue;

public class TaskExecutor implements Runnable {

  private BlockingQueue<Runnable> taskQueue;

  public TaskExecutor(BlockingQueue<Runnable> taskQueue) {
    this.taskQueue = taskQueue;
  }

  @Override
  public void run() {
    while(true) {
      Thread currentThread = Thread.currentThread();
      System.out.println("Running thread [" + currentThread.getName() + " ]");
      Runnable task = null;
      try {
        task = taskQueue.take();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      task.run();
      System.out.println("Finished thread [" + currentThread.getName() + " ]");

    }

  }
}
