package com.java;

public class HelloWorld {

    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog myDog = new Dog();

        // Set values using mutator methods
        myDog.setPetName("Buddy");
        myDog.setPetAge(3);
        myDog.setDogSpaceNumber(1);
        myDog.setDogWeight(25.5);
        myDog.setGrooming(true);

        // Display information using accessor methods
        System.out.println("Dog Name: " + myDog.getPetName());
        System.out.println("Dog Age: " + myDog.getPetAge());
        System.out.println("Dog Space Number: " + myDog.getDogSpaceNumber());
        System.out.println("Dog Weight: " + myDog.getDogWeight());
        System.out.println("Grooming: " + myDog.getGrooming());
    }

    // Dog class implementation goes here
    public static class Dog {
        private String petName;
        private int petAge;
        private int dogSpaceNumber;
        private double dogWeight;
        private boolean grooming;

        // Constructor
        public Dog() {
            this.petName = "";
            this.petAge = 0;
            this.dogSpaceNumber = 0;
            this.dogWeight = 0.0;
            this.grooming = false;
        }

        // Accessors (getters)
        public String getPetName() {
            return this.petName;
        }

        public int getPetAge() {
            return this.petAge;
        }

        public int getDogSpaceNumber() {
            return this.dogSpaceNumber;
        }

        public double getDogWeight() {
            return this.dogWeight;
        }

        public boolean getGrooming() {
            return this.grooming;
        }

        // Mutators (setters)
        public void setPetName(String petName) {
            this.petName = petName;
        }

        public void setPetAge(int petAge) {
            this.petAge = petAge;
        }

        public void setDogSpaceNumber(int dogSpaceNumber) {
            this.dogSpaceNumber = dogSpaceNumber;
        }

        public void setDogWeight(double dogWeight) {
            this.dogWeight = dogWeight;
        }

        public void setGrooming(boolean grooming) {
            this.grooming = grooming;
        }
    }
}
