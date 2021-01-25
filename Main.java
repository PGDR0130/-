//E=hf , E(J) = 平率*普朗克常數(6.63*10^-34)
//made by 張哲誠 2020/12/26
//輸入波的平率 , 輸出波的一顆光子能量
//平率請以科學記號的行式輸入(#.##*10^##)

import java.text.DecimalFormat;
import  java.util.Scanner;


class Main{
    public static void main(String[] args){
        double h = 6.63;
        double hback = -34;
        DecimalFormat numFormat = new DecimalFormat("0.#####E0");

        Scanner scanner = new Scanner(System.in);
        System.out.print("波的頻率 ");
        String f = scanner.next();

        double fnum = Double.parseDouble(f.substring(0,f.indexOf("*")));
        fnum = fnum*h;
        String front = numFormat.format(fnum);
        int fback = Integer.parseInt(f.substring(f.indexOf("^")+1));
        double pow = Integer.parseInt(front.substring(front.indexOf("E")+1))+hback+fback;

        System.out.print("一個光子 ");
        String result = Double.toString(fnum)+"*10^"+Integer.toString((int)pow)+"J";
        System.out.println(result);
    }
}