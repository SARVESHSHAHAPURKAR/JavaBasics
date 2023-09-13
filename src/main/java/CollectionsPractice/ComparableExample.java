package CollectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableExample {

    public static void main(String[] args) {

        List<Student> studs = new ArrayList<Student>();
        studs.add(new Student(12,"Sam",86));
        studs.add(new Student(46,"Tom",40));
        studs.add(new Student(37,"Jerry",64));

        Collections.sort(studs);
        // for collections sort to work on studs (without comparator instance argument)
        // , student class must implement comparable interface

        for(Student s : studs){
            System.out.println(s.getRollno()+" "+s.getName()+" "+s.getMarks());
        }

        // if you decide to change the comparable logic, you dont need to make change in the compareTo
        // method in the student class. You can use the sort method with a comparator instance, and this
        // logic will override the comparator

        Collections.sort(studs, Comparator.comparing(Student::getName));

        for(Student s : studs){
            System.out.println(s.getRollno()+" "+s.getName()+" "+s.getMarks());
        }
    }
}
