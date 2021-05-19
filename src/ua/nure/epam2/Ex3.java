package ua.nure.epam2;

import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        // Разместить в памяти массив из 20 элементов и заполнить его
        // рядом Фиббоначчи: 1, 1, 2, 3, 5, 8, 13, 21, …
        // В этом ряду каждое следующее число является суммой двух
        // предыдущих.
        int[] arr= new int[20];
        arr[0]=1;
        for(int i=1; i<arr.length; i++){
            if(i==1){
               arr[i]=i;
            }else{
                arr[i]=arr[i-2]+arr[i-1];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    }
