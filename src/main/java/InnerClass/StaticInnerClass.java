package InnerClass;

class OuterClassStatic{

    int height;
    int weight;

    public static class InnerClass{
        public void display(){
            System.out.println("Inside static inner clas");
        }
    }
}

public class StaticInnerClass {

    public static void main(String[] args) {

        OuterClassStatic outerClass = new OuterClassStatic();
        OuterClassStatic.InnerClass innerClass = new OuterClassStatic.InnerClass();

        innerClass.display();

    }
}
