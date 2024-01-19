package control_statements;

public class if_else {

    public static void main(String[] args) {

        int age = 76;

        if (age >= 75){
            System.out.println("Ok Boomer.");
        } else if (age >= 18) {
            System.out.println("You're an adult.");
        }else{
            System.out.println("You're not an adult.");
        }

    }
}