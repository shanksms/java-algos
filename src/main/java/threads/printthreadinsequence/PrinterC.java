package threads.printthreadinsequence;

public class PrinterC implements  Runnable {
    private Resource resource;

    public PrinterC(Resource resource) {
        this.resource = resource;
    }
    @Override
    public void run() {
        while (true) {
            synchronized (resource) {
                if (resource.flag == 3) {
                    System.out.print("C");
                    resource.flag = 1;
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
