package ua.nure.epam2;

import java.math.BigInteger;

public class Ex1 {
    public static void main(String[] args){
        // 1.4. Сосчитать сумму ряда 1!  - 2! +  3! – 4! + 5!- …
        // +n! для заданного числа n > 0. Чем шире диапазон
        // возможных значений n, тем лучше. Число n задавать
        // в коде программы.
        int n=1007;
        System.out.println(getFactorial(1).subtract(getFactorial(2)).add(
                getFactorial(3)).subtract(getFactorial(4)).add(getFactorial(
                        5)).subtract(getFactorial(n)) + " is result");

    }

    private static BigInteger getFactorial(int m){

        BigInteger mul =BigInteger.valueOf(1);
        for(int i=2; i<=m; i++){
           mul = mul.multiply(BigInteger.valueOf(i));
        }
        System.out.println(mul);
        return mul;
    }
}
