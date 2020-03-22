package juc;

import java.util.concurrent.CyclicBarrier;

public class CycliBarrierDemo extends Thread{
    @Override
    public void run() {
        System.out.println(" 开始进行数据分析");
    }
    public static void main(String[] args) {
        CyclicBarrier cycliBarrier=new CyclicBarrier(3,new CycliBarrierDemo());
        new Thread(new DataImportThread(cycliBarrier,"file1")).start();
        new Thread(new DataImportThread(cycliBarrier,"file2")).start();
        new Thread(new DataImportThread(cycliBarrier,"file3")).start();
        new Thread(new DataImportThread(cycliBarrier,"file4")).start();
        new Thread(new DataImportThread(cycliBarrier,"file5")).start();
        new Thread(new DataImportThread(cycliBarrier,"file6")).start();
    }
}
