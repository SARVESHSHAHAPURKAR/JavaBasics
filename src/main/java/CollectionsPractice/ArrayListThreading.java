package CollectionsPractice;

import java.util.Vector;

public class ArrayListThreading {

    static int count=0;

    public static void main(String[] args) throws InterruptedException {


        Vector<String> v = new Vector<String>();


        Thread t1 = new Thread(() -> {

            while (count < 10) {

                v.add("COunt is "+count++ +" thread is "+Thread.currentThread().getName());
            }
        },"Thread 1");

        Thread t2 = new Thread(() -> {
            while (count < 10) {

                v.add("COunt is "+count++ +" thread is "+Thread.currentThread().getName());
            }
        },"Thread 2");

        t1.start();
        t2.start();

        Thread.sleep(2000);

        for(String i : v){
            System.out.println(i);
        }

        // USING ARRAYLIST IN THIS CASE CAN CAUSE DATA RACING, SO USE VECTOR WHICH IS THREAD SAFE,
        // BUT IS SLOWER THAN ARRAYLIST
        // ONLY ONE THREAD CAN OPERATE ON A VECTOR AT A TIME
    }
}
