package threads.printthreadinsequence;

public class Main {
    public static void main(String[] args) {
        Resource resource = new Resource();
        resource.flag = 1;
        Thread t1 = new Thread(new PrinterA(resource));
        Thread t2 = new Thread(new PrinterB(resource));
        Thread t3 = new Thread(new PrinterC(resource));
        t1.start();t2.start();t3.start();

    }

}
