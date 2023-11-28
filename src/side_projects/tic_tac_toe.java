package side_projects;
import java.util.*;
public class tic_tac_toe {

    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();

    public static void main(String[] args) {

        //make the board
        char [][] gameBoard = { {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '}, };
        printGameBoard(gameBoard);

        //ask for a number
        Scanner scanner = new Scanner(System.in);
        while(true) {
            scanner = new Scanner(System.in);
            System.out.println("Enter your placement (1-9):");
            int playerPos= scanner.nextInt();  //enter a number which is the position
            //fix the position problem
            while(playerPositions.contains(playerPos) || cpuPositions.contains(playerPos)) {
                System.out.println("Position is taken. Enter a correct position");
                playerPos = scanner.nextInt();
            }
            placePiece(gameBoard, playerPos, "player");

            //Winner
            String result = checkWinner();
            if(result.length() >0) {
                printGameBoard(gameBoard);
                placePiece(gameBoard, playerPos, "player");
                System.out.println(result);
                scanner.close();
                break;
            }

            //give the computer a random position
            Random rand = new Random();
            int cpuPos = rand.nextInt(9) + 1;
            //fix the position problem
            while(playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)) {
                cpuPos = rand.nextInt(9) + 1;
            }

            placePiece(gameBoard, cpuPos, "cpu");

            printGameBoard(gameBoard);

            //Winner
            result = checkWinner();
            if(result.length() >0) {
                System.out.println(result);
                scanner.close();
                break;
            }
        }
        scanner.close();
    }

    //print out the board
    public static void printGameBoard(char [][] gameBoard){
        for(char[] row : gameBoard) {
            for(char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    //turn the number into X&O and put it on the board
    public static void placePiece(char [][] gameBoard, int pos, String user) {

        char symbol = ' ';

        //X&O
        if(user.equals("player")) {
            symbol='X';
            playerPositions.add(pos);
        }else if(user.equals("cpu")){
            symbol='O';
            cpuPositions.add(pos);
        }

        switch(pos) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }
    }

    //check the winner
    public static String checkWinner() {
        //all the winning conditions

        List<Integer> topRow = Arrays.asList(1, 2, 3);
        List<Integer> midRow = Arrays.asList(4, 5, 6);
        List<Integer> botRow = Arrays.asList(7, 8, 9);
        List<Integer> leftCol = Arrays.asList(1, 4, 7);
        List<Integer> midCol = Arrays.asList(2, 5, 8);
        List<Integer> rightCol = Arrays.asList(3, 6, 9);
        List<Integer> cross1 = Arrays.asList(1, 5, 9);
        List<Integer> cross2 = Arrays.asList(3, 5, 7);

        List<List<Integer>> winning = new ArrayList<List<Integer>>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(cross1);
        winning.add(cross2);

        for (List<Integer> l : winning) {
            if (playerPositions.containsAll(l)) {
                if (playerPositions.size() + cpuPositions.size() == 9) {
                    return "Congratulations you won!";
                }
                return "Congratulations you won!";
            } else if (cpuPositions.containsAll(l)) {
                return "CPU wins! You lost the game:(";
            }
        }
        while (playerPositions.size() + cpuPositions.size() == 9) {
            return "It's a tie.";
        }
        return "";

    }
}
