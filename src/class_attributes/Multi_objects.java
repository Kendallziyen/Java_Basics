package class_attributes;

public class Multi_objects {

    int x = 20;
    public static void main(String[] args) {

        Multi_objects myObj1 = new Multi_objects();
        Multi_objects myObj2 = new Multi_objects();

        myObj2.x = 40;

        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}


//change the attribute values in one object, without affecting the attribute values in the other