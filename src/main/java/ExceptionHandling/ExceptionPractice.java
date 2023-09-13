package ExceptionHandling;

public class ExceptionPractice {

    public static void main(String[] args) {

        int a =8;
        int b= 0;

        try {
            if (b == 0) {
                throw new CustomException("Cant divide by zero");
            }
            int k = a/b;
        }
        catch(CustomException e){
            System.out.println("Error is "+e.getMessage());
        }

    }
}
