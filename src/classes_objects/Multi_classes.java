package classes_objects;

public class Multi_classes {

    public static void main(String[] args) {

        class2 myObj = new class2();
        System.out.println(myObj.num);
    }
}

class class2 {

    int num = 3;
}
//create an object of a class and access it in another class
//for better organization of classes
// (one class has all the attributes and methods, while the other class holds the main() method (code to be executed))