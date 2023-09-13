package CollectionsPractice;

import java.util.LinkedHashSet;

public class LinkedHashSetPractice {

    public static void main(String[] args) {

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(2); linkedHashSet.add(3); linkedHashSet.add(1); linkedHashSet.add(4);

        for(Integer i : linkedHashSet){
            System.out.println(i);
        }

        // ORDER MAINTAINED
    }
}
