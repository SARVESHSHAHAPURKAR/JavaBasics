package CollectionsPractice;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapThreading {

    public static void main(String[] args) throws InterruptedException {
        // HashMap - Not thread-safe
        Map<String, Integer> hashMap = new HashMap<>(); // non-synchronized, one null key allowed
        Map<String, Integer> hashTable = new Hashtable<>();// thread-safe version of hash map, null key not allowed
        Map<String, Integer> concurrentHashMap = new ConcurrentHashMap<>(); // works well with multi-threads, rest same as hashmap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();// hashmap which maintains order of element insertion

        // treemap --> sorts the k,v pairs as per comparator rules r natural ordering

        Runnable hashMapTask = () -> {
            for (int i = 0; i < 1000; i++) {
                hashMap.put(String.valueOf(i), i);
                hashTable.put(String.valueOf(i), i);
                concurrentHashMap.put(String.valueOf(i), i);
                linkedHashMap.put(String.valueOf(i), i);

            }
        };

        // HashTable - Thread-safe (using synchronized methods)

        Runnable hashTableTask = () -> {
            for (int i = 0; i < 1000; i++) {
                hashMap.put(String.valueOf(i), i);
                hashTable.put(String.valueOf(i), i);
                concurrentHashMap.put(String.valueOf(i), i);
                linkedHashMap.put(String.valueOf(i), i);
            }
        };

        // ConcurrentHashMap - Thread-safe (concurrent)

        Runnable concurrentHashMapTask = () -> {
            for (int i = 0; i < 1000; i++) {
                hashMap.put(String.valueOf(i), i);
                hashTable.put(String.valueOf(i), i);
                concurrentHashMap.put(String.valueOf(i), i);
                linkedHashMap.put(String.valueOf(i), i);
            }
        };

        // LinkedHashMap - Not thread-safe

        Runnable linkedHashMapTask = () -> {
            for (int i = 0; i < 1000; i++) {
                hashMap.put(String.valueOf(i), i);
                hashTable.put(String.valueOf(i), i);
                concurrentHashMap.put(String.valueOf(i), i);
                linkedHashMap.put(String.valueOf(i), i);
            }
        };

        // Create and start multiple threads
        Thread thread1 = new Thread(hashMapTask);
        Thread thread2 = new Thread(hashTableTask);
        Thread thread3 = new Thread(concurrentHashMapTask);
        Thread thread4 = new Thread(linkedHashMapTask);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        // Wait for all threads to finish
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        // Print the size of each map
        System.out.println("HashMap size: " + hashMap.size()); //size can be >1000 due to race condition
        System.out.println("HashTable size: " + hashTable.size());// size will be exactly 1000
        System.out.println("ConcurrentHashMap size: " + concurrentHashMap.size());//size will be exactly 1000
        System.out.println("LinkedHashMap size: " + linkedHashMap.size());//size can be >1000 due to race condition

        for(Map.Entry<String, Integer> e : linkedHashMap.entrySet()){
            System.out.println(e.getKey());
        }
    }
}
