package control_statements;

public class demo_for_each {

    public static void main(String[] args) {
        int[] array= {1,2,3};

		/*		for (int i=0;i<array.length;i++) {
			        System.out.println(array[i]);
			    }
		*/
        for(int m : array) {
            System.out.println(m);
        }
    }
}
