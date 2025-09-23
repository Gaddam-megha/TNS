package com.tnsif.Abstraction;

class Square extends AbstractionShape {
    int side;

    Square(int side) {
        this.side = side;
    }

    @Override
    void area() {
        System.out.println("Area of Square = " + (side * side));
    }
}

class Rectangle extends AbstractionShape {
    int length, breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void area() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

public class TestAbstractionShape {
    public static void main(String[] args) {
        AbstractionShape s1 = new Square(5);
        s1.area();

        AbstractionShape s2 = new Rectangle(4, 6);
        s2.area();
    }
}
