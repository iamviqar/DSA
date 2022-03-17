package main;

import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {
        approach2();
    }

    public static void approach1(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max= a;
        if(b>max){
            max= b;
        }
        if(c>max){
            max=c;
        }

        System.out.println("Maximum is "+max);

    }

    public static void approach2(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max= Math.max(c,Math.max(a,b));

        System.out.println("Maximum is "+max);

    }
}
