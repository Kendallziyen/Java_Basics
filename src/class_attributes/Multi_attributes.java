package class_attributes;

public class Multi_attributes {

    String firstName = "Jim";
    String lastName = " Halpert";
    public static void main(String[] args) {

        Multi_attributes myFirst = new Multi_attributes();
        Multi_attributes myLast = new Multi_attributes();
        System.out.println("I'm " + myFirst.firstName + myLast.lastName);
    }
}
