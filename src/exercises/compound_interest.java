package exercises;

public class compound_interest {

    public static void main(String[] args){

        int PV = 10000;   // 本金
        double i = 0.01;   // 利率
        int n = 10;   // 週期(年)

        double FV = PV * Math.pow((1+i), n);   // 最後得到的錢

        System.out.println(FV);
    }
}


// 複利計算
// 公式 --> FV = PV(1+i)^n
