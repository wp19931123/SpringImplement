package cn.thread;

public class MyThread1 extends Thread {

    public static void main(String[] args) {
        MyThread1 th1 = new MyThread1();
        MyThread1 th2 = new MyThread1();
        th1.start();
        th2.start();
    }

    @Override
    public void run() {
        System.out.println("MyThread1 run..." + currentThread().getName());
    }
}
