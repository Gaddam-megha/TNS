package com.tnsif.Abstraction;

public class MainGetterSetter {
    public static void main(String[] args) {

        // create outer class object first
        GetterSetter outer = new GetterSetter();

        // create inner class object using outer object
        GetterSetter.Student s = outer.new Student();

        // set and get values
        s.setName("Meghana");
        s.setAge(21);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());

        s.setAge(-3); // invalid
    }
}
