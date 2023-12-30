package control_statements;

public class demo_switch_case {

    public static void main(String[] args) {

        char c='a';

        switch (c) {
            case 'a' -> System.out.println("a");
            case 'b' -> System.out.println("b");
            default -> System.out.println("default");
        }
    }
}

//    char c='a';
//
//		  switch(c) {
//            case 'a':
//                System.out.println("a");
//                break;
//            case 'b':
//                System.out.println("b");
//                break;
//            default:
//                System.out.println("default");
//      }