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
public class NumeralItem implements Item{
    private int value;
    
    //constructor with argument type int
    public NumeralItem(int theValue) {
        value = theValue;
    }
    
    //constructor copy from NumberalItem object
    public NumeralItem(NumeralItem numeral) {
        value = numeral.value;
    }
    
    //set method clone return copy of NumberalItem
    public NumeralItem clone() {
        return new NumeralItem(this);
    }
    
    //overriding method toString return NumeralItem type String
    public String toString() {
        return String.format("%d", value);
    }
    
 
}


