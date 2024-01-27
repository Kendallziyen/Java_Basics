package class_methods;

public class Static_vs_public {

    static void myStatic(){
        System.out.println("Static Methods can be called without creating objects");
    }

    public void myPublic() {
        System.out.println("Public Methods must be called by creating objects");
    }
    public static void main(String[] args) {

        myStatic();
        //myPublic(); --> error

        Static_vs_public myObj1 = new Static_vs_public();
        myObj1.myPublic();


    }
}


//static-->can be accessed without creating an object of the class
//public-->can only be accessed by objects