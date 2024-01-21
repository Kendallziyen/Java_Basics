package math_methods;

public class Methods {

    public static void main(String[] args){

        System.out.println(Math.max(5,10));
        System.out.println(Math.min(5,10));
        System.out.println(Math.sqrt(100));
        System.out.println(Math.abs(-5));   //returns the absolute (positive) value of x
        System.out.println(Math.random());  //generates a random number between 0 and 1


        //generates a random number between 0 and 100
        int randomNum = (int)(Math.random()*101);
        System.out.println(randomNum);
    }
}
