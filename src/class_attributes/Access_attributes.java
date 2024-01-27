package class_attributes;

public class Access_attributes {

    int x =20;
    public static void main(String[] args) {

        Access_attributes myObj = new Access_attributes();
        System.out.println(myObj.x);
    }
}


//attribute:類別的屬性
//access or modify or override
//don't want the ability to override values-->declare the attribute as "final"
