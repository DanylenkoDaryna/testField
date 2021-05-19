package ua.nure.epam2;

public class Linkedin2 {
    static int count=0;

    public static void main(String[] args){
        if(count<3){
            count++;
            System.out.println(count);
            main(null);
        }else{
            return;
        }
        System.out.println("Hello World");

    }
}
