package lk.ijse.ThreadsIntroduction;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("One " + Thread.currentThread().getName()); //Thread.currentThread() method allows to find out which thread runs
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "uba khd");

        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Two");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"man mehe");

        thread1.start();
//        thread1.setName("Thread One");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        System.out.println("Thread Name : " + thread1.getName());
//        System.out.println("Thread Name : " + thread2.getName()) ;
//        System.out.println("Thread Priority : " + thread1.getPriority());
//        System.out.println("Thread Priority : " + thread2.getPriority());
        thread2.start();
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread1.join();
        thread2.join();
        System.out.println("Thread Two Status : " + thread2.isAlive());

        System.out.println("BYE");
    }
}