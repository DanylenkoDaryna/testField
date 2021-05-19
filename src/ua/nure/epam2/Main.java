package ua.nure.epam2;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args){

//       char ch = '\u222E';
//        System.out.println(ch);

        BigDecimal bd1 = new BigDecimal(0.6);


        BigDecimal bd2 = new BigDecimal(0.3);


        BigDecimal bd3  = bd1.add(bd2);
       // bd3.setScale(0,BigDecimal.ROUND_CEILING);
        System.out.println(bd3);

        char ch = 123;
        System.out.println(ch);

        double d = 0.3+0.6;
        BigDecimal bd4 = new BigDecimal(d);
        bd4.setScale(0,BigDecimal.ROUND_DOWN);
        System.out.println(d+"\n"+bd4.toString());
    }
}
