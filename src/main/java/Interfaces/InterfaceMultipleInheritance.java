package Interfaces;

interface A{

     default void show(){
         System.out.println("Inside A");
     }

}

interface B{

    default void show(){
        System.out.println("Inside B");
    }

}

public class InterfaceMultipleInheritance {

    public static void main(String[] args) {

        MultipleInherit obj = new MultipleInherit();
        obj.show();
    }
}

class MultipleInherit implements A,B{

    // WHEN MULTIPLE INTRFACES ARE IMPLEMENTED, AND THE INTERFACES HAVE DEFAULT METHODS WITH
    // SAME METHOD NAME, YOU HAVE TO EITHER OVERRIDE THE METHOD IN THE IMPLEMENTATION AND DEFINE IT
    // NEWLY, OR YOU HAVE TO MENTION EXACTLY WHICH INTERFACE DEFAULT METHOD YOU WANT TO USE
    // EG A.SUPER.SHOW()


    @Override
    public void show() {
        A.super.show();
        // THIS CAN BE USED WHEN INTERFACE A HAS A DEFAULT METHOD NAMED SHOW
    }
}


