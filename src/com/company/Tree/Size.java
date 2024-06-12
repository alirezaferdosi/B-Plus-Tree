package com.company.Tree;

/**
 * Singleton class for set max degree
 */
public class Size {
    private Integer s;

    private static Size size = null;

    public static synchronized Size getInstance(){
        if( size == null) return new Size();
        else return size;
    }

    public boolean setSize(Integer s){
        if(s == null){
            this.s = s;
            return true;
        }else return false;
    }

    public Integer getSize(){return  s;}

}
