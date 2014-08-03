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
public class Node {
    Item data;
    Node next; //refers to the next item in the list
    
    public Node (Item data) {
        this.data = data.clone(); // deep copy
        next = null;
    }
    
    public Node(Node node) {
        data = node.data;
        next = null;
    }
}
