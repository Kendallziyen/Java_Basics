package APCS;

import java.util.Scanner;
public class Simple_adding {

    public static void main(String[] args){

        Scanner std = new Scanner(System.in);

        while (std.hasNextInt()){

            int n1 = std.nextInt();
            int n2 = std.nextInt();
            System.out.println(n1+n2);
        }
    }
}
