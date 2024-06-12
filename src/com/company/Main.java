package com.company;

import com.company.Tree.Component;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("enter the size: ");
        int size = Integer.parseInt(new Scanner(System.in).nextLine());
        Component[] c = new Component[size];
        Component[] cc = new Component[size+1];

        for(int i=0;i<size+1;i++){
            cc[i] = new Component();
        }

        for(int i=0;i<size;i++){
            c[i] = new Component();
            c[i].setLeft(cc[i]);
            c[i].setSearchKey((long) i);
            c[i].setRight(cc[i+1]);
        }

        for(Component t: c){
            System.out.println(t.getLeft() + "-" + t.getSearchKey() + "-" + t.getRight());
        }
    }
}
