package com.datastructure.linkedList;

import com.datastructure.linkedList.LinkedList;

public class Main {
    public static void main(String[] args) {
        var linkedList = new LinkedList<String>();
        linkedList.add("teste 1");
        linkedList.add("teste 2");
        linkedList.add("teste 3");
        linkedList.add("teste 4");

        linkedList.print();

        System.out.println("## REMOVENDO ##");
        linkedList.remove("teste 1");
        linkedList.remove("teste 5");
        linkedList.print();
    }
}