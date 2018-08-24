package cn.thread;

public class MyThread2 implements Runnable {

    public static void main(String[] args) {
        MyThread2 tr1 = new MyThread2();
        MyThread2 tr2 = new MyThread2();
        Thread th1 = new Thread(tr1);
        Thread th2 = new Thread(tr2);
        th1.start();
        th2.start();
    }

    @Override
    public void run() {
        System.out.println("MyThread2 run..." + Thread.currentThread().getName());
    }
}
