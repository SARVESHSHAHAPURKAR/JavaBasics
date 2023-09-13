package Interfaces;

interface A1{

    static void show(){
        System.out.println("Inside static method");
    }
}


public class StaticMethods {

    public static void main(String[] args) {


        // YES, INTERFACES CAN HAVE STATIC METHODS TOO!! BUT THEY SHOULD BE DEFAULT, AND SHOULD BE
        // CALLED DIRECTLY WITHOUT CREATING OBJECTS OF IMPLEMENTATION CLASSES.. static methods in
        // interfaces can be overridden or just kept as it is.
        A1.show();
    }
}
