package threads;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * a = [1, 2, 3, 4, 8, 9]
 * thread 1 should print : 1, 3, 8
 * thread 2 should print : 2, 4, 9
 * and they should print in order:
 * 1, 2, 3, 4, 8, 9
 */
public class EvenOddIndex {
    private  AtomicBoolean odd = new AtomicBoolean(false);

    private int [] arr = {1, 2, 3, 4, 8, 9};

    public void printOdd() {

        for (int i = 1; i < arr.length; i+=2) {

            while(true) {
                if (odd.get()) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread  " + Thread.currentThread().getName() + "  " + arr[i]);
                    synchronized (this) {
                        this.notify();
                    }
                    odd.set(false);
                    break;
                } else {
                    synchronized (this) {
                        try {

                            this.wait();

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }

        }

    }
    public void printEven() {
        for (int i = 0; i < arr.length; i+= 2) {

            while(true) {
                if (!odd.get()) {
                    System.out.println("Thread  " + Thread.currentThread().getName() + "  " + arr[i]);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (this) {
                        this.notify();
                    }
                    odd.set(true);
                    break;
                } else {
                    synchronized (this) {
                        try {
                            this.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }

        }
    }



    public static void main(String[] args) {
        int i = 0;
        while(i++ < 5) {

            EvenOddIndex evenOddIndex = new EvenOddIndex();
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    evenOddIndex.printEven();
                }
            });
            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    evenOddIndex.printOdd();
                }
            });
            t1.start();
            t2.start();
            try {
                t1.join();
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println();
            System.out.println();

        }

    }

}
