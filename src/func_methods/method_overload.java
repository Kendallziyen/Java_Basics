package func_methods;

public class method_overload {

    static int plusMethod(int x,int y){
        return x + y;
    }

    static double plusMethod(double x,double y){
        return x + y;
    }
    public static void main(String[] args) {

        int num1 = plusMethod(5,10);
        double num2 = plusMethod(5.5,10.5);

        System.out.println(num1);
        System.out.println(num2);
    }
}


//Instead of defining two methods that should do the same thing, it is better to overload one
//Multiple methods can have the same name as long as the number and/or type of parameters are different