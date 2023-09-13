package Varargs;

class Varargs{

    public int add (int ... n){

        int sum=0;

        for(int i: n){
            sum+=i;
        }

        return sum;
    }
}

public class VarargsPractice {


    public static void main(String[] args) {

        Varargs varargs = new Varargs();
        System.out.println("The result is "+varargs.add(38,67,578,764,524));
    }
}
