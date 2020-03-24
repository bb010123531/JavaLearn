package threadtest;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadAddVolatile {

    public static volatile boolean flag;

    public static AtomicInteger odd = new AtomicInteger(1);
    public static AtomicInteger even = new AtomicInteger(0);

    public static void main(String[] args) {

        Thread a = new Thread(() -> {
            while(true) {
                if (flag) {
                    odd.getAndIncrement();
                    System.out.println(Thread.currentThread().getName() + ' ' + odd.getAndIncrement());
                    flag = !flag;
                }

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread b = new Thread(() -> {
            while(true) {
                if (!flag) {
                    even.getAndIncrement();
                    System.out.println(Thread.currentThread().getName() + ' ' + even.getAndIncrement());
                    flag = !flag;
                }

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        a.start();
        b.start();
    }
}
