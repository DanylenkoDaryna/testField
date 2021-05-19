package ua.nure.epam2;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Ex2 {
    public static void main(String[] args) {
        // Подсчитать, сколько шестизначных цифр имеют равную
        // сумму трех первых и трех последних цифр
        int  res =0;
        for (int i = 100000; i < 1000000; i++) {
                if(isDigitsEqual(i)){
                 res= res+1;
                }
        }
        System.out.println(res);
    }

    private static boolean isDigitsEqual(int n){
        String temp = n+"";
        char[] arr = temp.toCharArray();
        if(arr[0]+arr[1]+arr[2]==arr[3]+arr[4]+arr[5]){
            System.out.println("n= "+ n);
            System.out.println(true);
            return true;
        }
        else return false;
    }
}
