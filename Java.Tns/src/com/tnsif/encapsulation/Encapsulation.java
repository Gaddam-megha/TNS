package com.tnsif.encapsulation;

public class Encapsulation {

    // Inner class Car demonstrating encapsulation
    public class Car {

        // --- Encapsulated (private) data members ---
        private String color;
        private String model;
        private int numberOfSeats;

        // --- Constructor ---
        public Car(String color, String model, int numberOfSeats) {
            this.color = color;
            this.model = model;
            this.numberOfSeats = numberOfSeats;
        }

        // --- Getters and Setters ---
        public String getColor() { return color; }
        public void setColor(String color) { this.color = color; }

        public String getModel() { return model; }
        public void setModel(String model) { this.model = model; }

        public int getNumberOfSeats() { return numberOfSeats; }
        public void setNumberOfSeats(int numberOfSeats) {
            if (numberOfSeats <= 0) {
                throw new IllegalArgumentException("Seats must be greater than 0");
            }
            this.numberOfSeats = numberOfSeats;
        }

        // --- Methods (behaviors) ---
        public void start() { System.out.println(model + " is starting..."); }
        public void stop()  { System.out.println(model + " is stopping."); }
        public void drift() { System.out.println(model + " is drifting!"); }

        // --- For printing object details ---
        @Override
        public String toString() {
            return "Car{color='" + color + "', model='" + model + "', seats=" + numberOfSeats + "}";
        }
    } // end of inner class Car
} // end of outer class Encapsulation
