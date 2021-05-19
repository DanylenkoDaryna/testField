package ua.nure.epam2;

public class Mod2Ex1 {
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(p.x);
        p.show();

        Child ch = new Child();
        System.out.println(ch.x);
        ch.show();


        System.out.println(p instanceof Child);
        System.out.println(ch instanceof Child);
        System.out.println(ch instanceof Parent);


        p=ch;
        System.out.println(p.x);
        p.show();
        
    }
}

class Parent{

    int x = 34;

    void show(){
        System.out.println("parent method");
    }
    Parent(){
        System.out.println("ppp");
    }

}

class Child extends Parent{

    int x = 35;

    void show(){
        System.out.println("child method");
    }

    Child(){
        System.out.println("cccc");
        }
}
