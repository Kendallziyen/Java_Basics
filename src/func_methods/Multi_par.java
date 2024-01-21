package func_methods;

public class Multi_par {

    static void living(String name, int age){

        System.out.println(name + " is " + age + " and lives in Taiwan.");
    }
    public static void main(String[] args){
        living("Michael",40);
        living("Dwight",35);
        living("Andy",30);
    }
}
