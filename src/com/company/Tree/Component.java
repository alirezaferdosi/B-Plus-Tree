package com.company.Tree;

public class Component<T>{
    private Node left;
    private T searchKey;
    private Node right;

    public Component(T searchKey){
        this.searchKey = searchKey;
    }


    public Node setLeft(Node left){
        return this.left = left;
    }

    public Node setRight(Node right){ return this.right = right; }

    public T setSearchKey(T searchKey){
        return this.searchKey = searchKey;
    }

    public Node getLeft() {
        return left;
    }

    public T getSearchKey() {
        return searchKey;
    }

    public Node getRight() {
        return right;
    }
}
