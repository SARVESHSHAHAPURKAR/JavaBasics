package CollectionsPractice;

import java.util.*;

public class CollectionPractice {

    // COLLECTION IS AN INTERFACE WHICH IS EXTENDED BY LIST (interface), Arraylist implements list
    // AND SO ON FOR OTHER DATA STRUCTURES AS WELL

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>(); // dont need to provide type here, as its already
                                                   // decalred in reference variable

        intList.add(1);

        List<Integer> vector = new Vector<>();
        List<Integer> l = new LinkedList<>(); // linked list in java is an implementation of doubly linkedlist
        Stack<Integer> st = new Stack<>();

        st.push(1); st.pop(); st.peek(); // STACK IS ALSO AN IMPLEMENTATION OF LIST ALONG WITH PUSH
                                              // AND POP MECHANISMS

        vector.add(1);

        Set<String> treeSet = new TreeSet<>(); //sorted SET

        Set<String> hashSet = new HashSet<>(); //unsorted random-order SET
        Set<String>  linkedHashSet = new LinkedHashSet<>(); // ordered set. elements come out in the same
                                                            // order they go inside.




    }
}
