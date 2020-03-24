package threadtest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadAddLock {
    public static ReentrantLock lock = new ReentrantLock();
    public static Condition odd = lock.newCondition();
    public static Condition even = lock.newCondition();

    public static int a = 0;

    public static void main(String[] args) {
        Thread a = new Thread(() -> {
            while(true) {
                try {
                    lock.lock();
                    System.out.println(Thread.currentThread().getName() + ' ' + ThreadAddLock.a++);
                    Thread.sleep(2000);
                    odd.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        });

        Thread b = new Thread(() -> {
            while(true) {
                try {
                    lock.lock();
                    System.out.println(Thread.currentThread().getName() + ' ' + ThreadAddLock.a++);
                    Thread.sleep(2000);
                    odd.signal();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        });

        a.start();
        b.start();
    }
}
