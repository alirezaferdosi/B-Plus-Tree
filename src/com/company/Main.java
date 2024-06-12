package com.company;


import org.w3c.dom.Node;

public class Main {

    public static void main(String[] args) {
        Class c = Node.class;
        System.out.println(c.getName().substring(10));
    }

    public static <T extends Comparable<T>> int comparTo(T t1, T t2){
        return t1.compareTo(t2);
    }
}
