package side_projects;

import java.util.Scanner;
import java.util.Random;
public class Num_guessing {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int randNum = rand.nextInt(100) + 1;
        int tryCount = 0;


        while (true) {

            System.out.println("Guess a number between 1~100!");

            int playerNum = scanner.nextInt();
            tryCount ++;

            if (playerNum == randNum) {
                System.out.println("Correct! You Win!");
                System.out.println("It took you " + tryCount + " tries to win");
                break;
            } else if (randNum > playerNum) {
                System.out.println("Nope. The number is higher. Guess again : )");
                System.out.println();
            } else {
                System.out.println("Nope. The number is lower. Guess again : )");
                System.out.println();
            }
        }

        scanner.close();
    }


}
