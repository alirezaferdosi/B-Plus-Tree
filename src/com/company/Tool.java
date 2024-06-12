package com.company;

import com.company.Tree.Component;

public class Tool {
    private static Component Root;

    private Integer size;



    public boolean setSize(Integer size){
        if(size == null){
            this.size = size;
            return true;
        }
        else return false;
    }



}
