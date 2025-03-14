package org.example;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void countdown(int i){
        System.out.println(i);
        if(i <= 0)
            return;
        else
            countdown(i-1);

    }
    public static void main(String[] args) {
        countdown(5);
        List<Integer> linklist = new LinkedList<>();
        linklist.add(1);
        linklist.add(2);
        linklist.add(3);
        linklist.add(4);

        for(int a:linklist){
            if(linklist.listIterator().hasNext())
                System.out.println(a);
        }

    }
}