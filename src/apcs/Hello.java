package apcs;

import java.util.Scanner;


public class Hello {
    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);
        String std = myObj.nextLine();
        System.out.println("hello, " + std);
    }
}