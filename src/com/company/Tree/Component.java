package com.company.Tree;

public class Component {
    private Component left;
    private Long searchKey;
    private Component right;


    public Component setLeft(Component left){
        return this.left = left;
    }

    public Component setRight(Component right){ return this.right = right; }

    public Long setSearchKey(Long searchKey){
        return this.searchKey = searchKey;
    }

    public Component getLeft() {
        return left;
    }

    public Long getSearchKey() {
        return searchKey;
    }

    public Component getRight() {
        return right;
    }
}
