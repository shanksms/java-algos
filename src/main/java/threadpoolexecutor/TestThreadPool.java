package threadpoolexecutor;

public class TestThreadPool {
  public static void main(String[] args) throws InterruptedException {

    ThreadPool threadPool = new ThreadPool(3);
    //Created 15 Tasks and submit to pool
    for(int taskNumber = 1 ; taskNumber <= 3; taskNumber++) {
      TestTask task = new TestTask(taskNumber);
      threadPool.submit(task);
    }
  }
}