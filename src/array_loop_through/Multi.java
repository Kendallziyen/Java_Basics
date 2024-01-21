package array_loop_through;

import java.util.Arrays;

public class Multi {

    public static void main(String[] args){

        int[][] arrayNum = {{0,1,2,3},{4,5,6}};

        for (int[] arrayLoop: arrayNum){
            System.out.println(Arrays.toString(arrayLoop));
        }

        System.out.println();

        for (int[] arraycopy : arrayNum) {
            for (int i : arraycopy) {
                System.out.println(i);

            }
        }
    }
}
