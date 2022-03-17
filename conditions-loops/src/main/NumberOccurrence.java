package main;

import java.util.Scanner;

public class NumberOccurrence
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int srcNum = in.nextInt();
        int searchNum = in.nextInt();

        int occurance = 0;

        while(srcNum>0){
            int rem = srcNum % 10;
            if(rem==searchNum){
                occurance++;
            }
            srcNum= srcNum/10;
        }


        System.out.println(occurance);
    }
}
