package CollectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparablePractice {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();
        v1.age=5;
        Vehicle v2 = new Vehicle();
        v2.age=10;
        Vehicle v3 = new Vehicle();
        v3.age=15;

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(v1);vehicles.add(v2);vehicles.add(v3);

        Collections.sort(vehicles);

        for(Vehicle v: vehicles) {
            System.out.println(v.age);
        }
    }
}
