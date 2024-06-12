package com.company.Tree;

import java.util.ArrayList;
import java.util.List;
import com.company.Tree.Size;

public class Root<T extends Comparable<T>> extends Node{
    Node<T> ROOT;

    public Root(){
        ROOT = new Root<T>();
    }
}
