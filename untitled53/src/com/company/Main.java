package com.company;

import java.util.Scanner;
//N input : 16
//output : 16 11 6 1 -4 1 6 11 16
public class Main {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
      System.out.print("The number: ");
      int a= inp.nextInt();
        System.out.println(process(a,a,0));

    }
    static int process(int k,int z,int j) {
        System.out.print(z+" ");
        if (z <=0|| j==1){
        while(z!=k) {

                return process(k,z+5,1);
            }
        System.exit(0); }

        return process(k,z-5,0);
    }
}
