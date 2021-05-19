package ua.nure.epam2;

public class Ex6 {
    public static void main(String[] args) {
        //1.10. Создать "треугольный" массив из 10 строк
        // и заполнить его биномиальными коэффициентами
        // (треугольник Паскаля)
        int n=10;
    int[][] triangle=new int[n+1][n+1];
    for(int i=0; i<=n; i++) {
            triangle[i][0]= triangle[i][n]=1;
            for(int j=1; j<i; j++){
                triangle[i][j]= triangle[i-1][j-1]+triangle[i-1][j];
            }
    }
    show(triangle, n);
    }

    private static void show(int[][]arr, int lines){
        for (int n = 0; n <= lines; n++) {
            for (int k = 0; k <= n; k++) {
                System.out.print(arr[n][k] + " ");
            }
            System.out.println();
        }
    }
    }
