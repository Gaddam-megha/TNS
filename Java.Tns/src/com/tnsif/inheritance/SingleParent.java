package com.tnsif.inheritance;

//Parent class
public class SingleParent {
 int a = 10;

 public void show() {
     System.out.println("This is SingleParent class");
 }
}

//Child class
class SingleChild extends SingleParent {
 public void display() {
     System.out.println("This is SingleChild class (extends SingleParent)");
 }
}
