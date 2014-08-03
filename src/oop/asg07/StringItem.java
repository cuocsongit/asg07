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
public class StringItem implements Item{
    private String value;
    
    //constructor with argument type String
    public StringItem (String theValue) {
        value = theValue;
    }
    
    //constructor copy from StringItem object
    public StringItem(StringItem stringItem) {
        value = stringItem.value;
    }
    
    //set method clone() return copy of StringItem
    public StringItem clone() {
        return new StringItem(this);
    }
    
    //set method to String()return StringItem type String
    public String toString() {
        return value;
    }
    
   
}
