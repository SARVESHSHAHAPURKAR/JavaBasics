package CollectionsPractice;

public class Vehicle implements Comparable<Vehicle> {

    String model;

    int age;


    @Override
    public int compareTo(Vehicle o) {
        return this.age- o.age;
    }
}
