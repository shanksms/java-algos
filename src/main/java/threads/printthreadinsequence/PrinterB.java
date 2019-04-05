package threads.printthreadinsequence;

public class PrinterB implements  Runnable {
    private Resource resource;

    public PrinterB(Resource resource) {
        this.resource = resource;
    }
    @Override
    public void run() {
        while (true) {
            synchronized (resource) {
                if (resource.flag == 2) {
                    System.out.print("B");
                    resource.flag = 3;
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
