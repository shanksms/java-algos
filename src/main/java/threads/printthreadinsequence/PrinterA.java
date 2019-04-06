package threads.printthreadinsequence;

public class PrinterA implements  Runnable {
    private Resource resource;

    public PrinterA(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (resource) {
                if (resource.flag == 1) {
                    System.out.print("A");
                    resource.flag = 2;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    resource.notifyAll();
                } else {
                    try {
                        resource.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }


    }
}
