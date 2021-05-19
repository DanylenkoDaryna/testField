package ua.nure.epam2;

public class Ex5 {
    public static void main(String[] args) {
        // 1.9. Создать целый шестимерный массив с двумя
        // значениями в каждом измерении. Заполнить массив
        // числами из начала натурального ряда: 1, 2, 3, …
        // Сказать, сколько потребуется чисел ?
        int [][][][][][] superArr = new int[2][2][2][2][2][2];
       int count =0;
        for(int i=0; i<2; i++){
           for(int j=0; j<2; j++){
               for(int n=0; n<2; n++){
                   for(int m=0; m<2; m++){
                       for(int p=0; p<2; p++){
                           for(int q=0; q<2; q++){
                               superArr[i][j][n][m][p][q]=++count;
                               System.out.println(superArr[i][j][n][m][p][q]);
                               count=count++;
                           }
                           System.out.println("\t");
                       }
                       System.out.println("\t");
                   }
                   System.out.println("\t");
               }
               System.out.println("\t");
           }
            System.out.println("\t");
       }
        System.out.println("We need "+count + " natural numbers for array");
    }
    }
