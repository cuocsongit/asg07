/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop.asg07;

/**
 *
 * @author Le
 */
public class MyListDemo {
    public static void main(String [] args) {
        MyList l = new MyList();
        l.append(new NumeralItem(1));
        l.append(new NumeralItem(2));
        System.out.println(l); // (1, 2)
        MyList l2 = new MyList();
        l2.append(new StringItem("a"));
        l2.append(new StringItem("b"));
        System.out.println(l2); // (a, b)
        l.append(l2);
        System.out.println(l); // (1, 2, (a, b))
        l.appendList(l2);
        System.out.println(l); // (1, 2, (a, b), a, b)
        MyList list = new MyList(l);
        System.out.println(list);
        l2.append(new NumeralItem(5));  
        System.out.println(l2); // (a, b, 5)
        System.out.println(l); // (1, 2, (a, b), 3, 4)
        System.out.println(l.length());//5
        list = new MyList(l);
        System.out.println(list);
        System.out.println(list.equals(l));
        list.invert();
        System.out.println(list);
    }
}
