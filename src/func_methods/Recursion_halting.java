package func_methods;

public class Recursion_halting {

    public static void main(String[] args) {

        int result = sum(5,10);
        System.out.println(result);
    }

    public static int sum(int start,int end){

        if(end > start){
            return end + sum(start,end - 1);
        }else{
            return end;
        }
    }
}

//add all the numbers between 5~10 using recursion