package exercises;

import java.time.LocalDate;

public class Retired_year {

    public static void main(String[] args){

        int now_age = 16;
        int retire_age = 45;

        int currentYear = LocalDate.now().getYear();
        int retire_year = currentYear + (retire_age - now_age);

        System.out.println(retire_year);
    }
}


// 退休年齡計算