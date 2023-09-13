package CollectionsPractice;

import java.util.*;

public class ComparatorExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("Pikachu");
        list.add("Tom");
        list.add("Jerry");

        // custom sorting based on 3rd character

        // METHOD 1 ---> ANONYMOUS CLASS
        Comparator<String> c1 = new Comparator<String>(){


            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(2)<o2.charAt(2)?-1 : 1; // 1 means swap the positions
                                                        // -1 means dont swap
            }
        };

        // METHOD 2 --> LAMBADA EXPRESSION (STATEMENT)
        Comparator<String> c2 = (String s1, String s2) -> {
            return s1.charAt(2)>s2.charAt(2)?1:-1;
        };

        Comparator<String> c3 = (String s1, String s2) -> s1.charAt(2)>s2.charAt(2)?1:-1;

        Collections.sort(list,c1);
        // COMPARATOR HELPS TO ADD CUSTOM SORTING LOGIC

        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        // ANOTHER EXAMPLE

        List<Integer> intList = new ArrayList<Integer>();

        intList.add(496); intList.add(542); intList.add(527);

        Collections.sort(intList, (Integer o1, Integer o2)-> (o1%10)<(o2%10)?-1:1 );

        System.out.println(intList);


    }
}
