package ua.nure.epam2;

import java.util.Arrays;

public class ex4 {
    public static void main(String[] args) {
        // Создать двумерный массив символов и заполнить
        // его буквами 'Ч' и 'Б' в шахматном порядке
        //
        char[][] chess=new char[8][9];
        for(int i=0; i<8; i++){
            if(i==0 || i%2==0){
                for(int j=0; j<9; j++){
                    if(j==0|| j%2==0){
                        chess[i][j]='Ч';
                    }else chess[i][j]='Б';
                }
            }else{
                for(int j=0; j<9; j++){
                    if(j==0|| j%2==0){
                        chess[i][j]='Б';
                    }else chess[i][j]='Ч';
                }
            }
        }
        System.out.println(Arrays.deepToString(chess));
        for(int n=0; n<8; n++){
            System.out.println(Arrays.toString(chess[n]));
        }
    }
    }
