package com.company.Tree;

import java.util.HashMap;
import java.util.Map;

public class Node {

    private Map<SearchKey,Pointer> node;

    private final int size;

    private Node Root;



    public Node(int size){
        this.size = size;
    }

    public void setNode(SearchKey searchKey, Pointer pointer) {
        this.node = (Map<SearchKey, Pointer>) new HashMap<SearchKey, Pointer>().put(searchKey,pointer);
    }

    public Map<SearchKey, Pointer> getNode() {
        return node;
    }
}
