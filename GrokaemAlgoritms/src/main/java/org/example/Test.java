package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class A implements Runnable
{
    public void run(){
        for(int i=0;i<100;i++)
        {
            System.out.println("A");
        }
    }

}
class B extends Thread
{
    public void run(){
        for(int i=0;i<100;i++)
        {
            System.out.println("B");
        }
    }

}
class People implements Comparable<People>
{
    String name;
    int age;

    public People(String name,int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(People that) {
        if(this.name.length() > that.name.length())
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
//class People
//{
//    String name;
//    int age;
//    public People(String name,int age){
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "People{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//}

public class Test
{
    public static void main(String[] args)
    {
//        Runnable obj1 = new A();
//        Runnable obj2 = new B();
//
//        Thread t1 = new Thread(obj1);
//        Thread t2 = new Thread(obj2);
//
//        t1.start();
//        t2.start();

        People people = new People("Петр",12);
        People people1 = new People("Александр",13);
        People people2 = new People("Саша",90);
        People people3 = new People("Ян",46);
        People people4 = new People("Влад",25);

//        Comparator<People> comp = new Comparator<People>() {
//            @Override
//            public int compare(People o1, People o2) {
//                if(o1.name.length() > o2.name.length())
//                    return 1;
//                else
//                    return -1;
//            }
//        };

        List<People> array = new ArrayList<>();
        array.add(people);
        array.add(people1);
        array.add(people2);
        array.add(people3);
        array.add(people4);
//        Collections.sort(array,comp);
        List<People> array1 =  array.stream()
                .sorted()
                .collect(Collectors.toList());

        for(People i : array)
        {
            System.out.println(i);
        }









//        Flyable plane = () -> System.out.println("Самолет летит");
//        plane.fly();
    }
}
