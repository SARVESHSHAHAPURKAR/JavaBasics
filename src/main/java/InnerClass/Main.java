package InnerClass;

class OuterClass{

    int height;
    int weight;

    class InnerClass{

        void display(){
            System.out.println("Inner class display");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        OuterClass obj1 = new OuterClass();

        OuterClass.InnerClass innerClassInstance = obj1.new InnerClass();
        innerClassInstance.display();
    }
}