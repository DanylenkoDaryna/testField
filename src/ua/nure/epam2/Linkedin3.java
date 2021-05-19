package ua.nure.epam2;

import javax.imageio.IIOException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Linkedin3 {

    public static void main(String[] args) throws IOException{
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(1);
//        list.add(5);
//        list.add(10);
//        //System.out.println(list);
//        ///////////////////////////////////////////
//        String[] array = {"abc", "2", "10", "0"};
//        List<String> list2 = new ;
//        Collections.sort(list2);
//        System.out.println(Arrays.toString(array));
//        List.D
//        int x=5;
//        x=10;
//        System.out.println(x);
//        //String s= "Hello world!".compareTo("asdsd");
//        System.out.println(s.substring(6,12));
//
//        try{

//        }catch(Exception e){
//
//        }catch(Exception re){
//
//        }
        A a = new B();
        a.m();


    }
}

class A{
    void m()throws IOException{
        System.out.println("A.m()");

    }
}
class B extends A {

    void m () throws IIOException {
        System.out.println("A.m()");
    }
}
