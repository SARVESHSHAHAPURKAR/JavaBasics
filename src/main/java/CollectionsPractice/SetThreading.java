package CollectionsPractice;

import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SetThreading {

    public static void main(String[] args) throws InterruptedException {

        Set<Integer> st = new TreeSet<>();
        Object object = new Object();
        Lock lock = new ReentrantLock();

        Runnable r1 = () -> {
            for(int i=0; i<100; i++){
                lock.lock();
                st.add(i);
                lock.unlock();
            }
        };

        Runnable r2 = () -> {
            for(int i=0; i<100; i++){
                lock.lock();
                st.add(i);
                lock.unlock();
                }

        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Set size is "+st.size());
        for(Integer i: st){
            System.out.println(i);
        }

        // IF YOU DONT USE SYNCHRONIZED BLOCK(OR LOCK) OVER SET, SET SIZE WILL BE >100 AND SOME
        // DUPLICATE ELEMENTS WILL BE THERE
    }
}
