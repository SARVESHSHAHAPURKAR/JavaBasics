package CollectionsPractice;

import java.util.*;

public class IteratorPractice {

    public static void main(String[] args) {

        Map<String, Integer> mp = new HashMap<>();
        mp.put("One",1);
        mp.put("Two", 2);
        mp.put("Three",3);

        Iterator<String> it = mp.keySet().iterator(); // iterator works on key of map

        while(it.hasNext()){
            String k = it.next();
            System.out.println(k+" "+mp.get(k));
        }

        ArrayList<String> list = new ArrayList<>();
        list.add("Hi");
        list.add("Hello");
        list.add("How are you");

        Collections.sort(list); // sorting method
        Collections.reverse(list); // reverse method

        Iterator<String> it2 =  list.iterator();
        while(it2.hasNext()){
            String k = it2.next();
            System.out.println(k);
        }

        Set<Integer> set = new HashSet<>();
        set.add(5); set.add(1); set.add(9); set.add(2);

        Iterator<Integer> it3 = set.iterator();
        while(it3.hasNext()){
            System.out.println(it3.next());
        }







    }
}
