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
public class MyList implements Item{
    private Node start, end;
    private int length;
    
    //default constructor 
    public MyList() {
        start = end = null;
        length = 0;
    }
    
    //constructor copy from other MyList object
    public MyList(MyList myList) {
        start = new Node(myList.start);
        end = start;
        Node node;
        for(node = myList.start.next; node != null; node = node.next) {
            end.next = new Node(node);
            end = end.next;
        }
        length = myList.length;
    }
    
    //return copy MyList
    public MyList clone() {
        return new MyList(this);
    }
    
    //add new element to end of list
    public void append(Item item) {
        if(start == null) {
            start = new Node(item);
            end = start;
        }
        else {
            end.next = new Node(item);
            end = end.next;
        }
        length++;
    }
    
    public String toString() {
        Node node;
        String list = "(";
        if(start == null ) {
            return null;
        }
        else if(start.next == null) {
            list += start.data +")";
            return list;
        }
        
        for(node = start; node.next != null; node = node.next) {
            list += node.data + ", ";
        }
        list += end.data + ")";
        return list;
    }
    
    public void appendList(MyList myList) {
        Node cursor ;
        if(start == null) {
            start = new Node(myList.start);
            end = start;
            length = 1;
            for(cursor = myList.start.next; cursor != null; cursor = cursor.next) {
                end.next = new Node(cursor);
                end = end.next;
                length++;
            }
        }
        else {
            for(cursor = myList.start; cursor != null; cursor = cursor.next) {
                end.next = new Node(cursor);
                end = end.next;
                length++;
            }
        }
    }
    //return size of MyList
    public int length() {
        return length;
    }
    
    //compare MyList argument
    public boolean equals(MyList myList) {
        
        return toString().equals(myList.toString());
    }
    
     public Item find(Item item) {
         if(length == 0) {
             return null;
         }
         else{
             Node node = start;
             for(int i = 0; i < length; i++) {
                 if(node.toString().equals(item.toString())) {
                     return node.data;
                 }
                 node = node.next;
             }
         }
         return null;
    }
    
     public void invert() {
         MyList reverse = new MyList();
         if(length > 0) {
             Node node, temp, current;
             reverse.end = new Node(start);
             current = end;
             for(node = start.next; node != null ; node = node.next) {
                 temp = new Node(node);
                 temp.next = current;
                 current = temp;
             }
             reverse.start = current;
             start = reverse.start;
             end = reverse.end;
         }
    }
}
