package control_statements;

public class Break_continue {

    public static void main(String[] args){

        int i = 0;
        while (i<10){

            if (i == 2){

                break;
            }

            System.out.println(i);
            i++;
        }  //break

        System.out.println();

        int j = 0;
        while (j<10){

            if (j == 4){
                j++;
                continue;
            }  //continue

            System.out.println(j);
            j++;
        }
    }
}
