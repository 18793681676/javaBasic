package com.thirtyone;

public class A {
    /*static boolean Paddy;*/
    String str=new String("good");
    char[]ch={'a','b','c'};
    public static void main(String[] args) {
       /* String str=new String("hello");
        if(str=="hello")
        {
            System.out.println("true");
        }
        else     {
            System.out.println("false");
        }*/
        /* System.out.println(Paddy);*/
        A ex=new A();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+" and ");
        System.out.print(ex.ch);
    }
    public void change(String str,char ch[]){
        str="test ok";
        ch[0]='g';



    }
}

