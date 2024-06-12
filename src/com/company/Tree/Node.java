package com.company.Tree;

import java.util.ArrayList;
import java.util.List;

public class Node<T extends Comparable<T>> {
    private List<Component<T>> list = new ArrayList<Component<T>>();
    private Node left;
    private Node right;


    public boolean addComponent(Component<T> component,Node node){
        Component<T> component1 = component;

        if(Size.getInstance().getSize() - 1 != list.size()){
            node.list.add(component);
            return true;
        }
        else{
            float result;
            Node temp;
            for(Object c: node.list){
                Component<T> component2 = (Component) c;
                result = component2.getSearchKey().compareTo(component1.getSearchKey());

                if(result < 0){
                    if(component2.getLeft() != null){
                        addComponent(component1,node);
//                        --------------------
                    }
                    else {
                        component2.setLeft(new Node());
                        addComponent(component1,component2.getLeft());
                        return true;
                    }
                }
                if(result >= 0){
                    if(component2.getRight() != null){

                    }
                    else {
                        component2.setRight(new Node());
                        addComponent(component1,component2.getRight());
                        return true;
                    }
                }

            }
        }
        return false;
    }
}
