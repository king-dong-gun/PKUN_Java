package ch13.sec05.exam01;

public class SafeStopExample {
    public static void main(String[] args) {
        PrintThread printThread = new PrintThread();
        printThread.start();

        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){}

        printThread.setStop(true);
    }
}
