package variables_string;

public class bmi {

    public static void main(String[] args){

        double height = 1.56;
        double weight = 58.2;
        double bmi = weight / Math.pow(height, 2);

        System.out.println(bmi);
    }
}


// BMI計算