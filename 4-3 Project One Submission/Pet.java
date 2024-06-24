package com.Java;

import java.util.Scanner;

public class Pet {
    private String petType;
    private String petName;
    private int petAge;
    private int daysStay;
    private int dogSpaces;
    private double amountDue;

    // Constructor
    public Pet(String petType, String petName, int petAge, int daysStay, int dogSpaces, double amountDue) {
        this.petType = petType;
        this.petName = petName;
        this.setPetAge(petAge);
        this.daysStay = daysStay;
        this.dogSpaces = dogSpaces;
        this.amountDue = amountDue;
    }

    // Getter and setter methods for petType
    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    // Other getter and setter methods for other attributes

 // Method to prompt user for pet information and process check-in
    public void checkIn() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Pet Boarding and Grooming!");
        System.out.println("Please enter your pet's information:");

        System.out.print("Pet type: ");
        this.petType = scanner.nextLine();

        System.out.print("Pet name: ");
        this.petName = scanner.nextLine();

        System.out.print("Pet age: ");
        // Ensure you handle the newline character
        this.setPetAge(Integer.parseInt(scanner.nextLine()));

        System.out.print("Days of stay: ");
        // Ensure you handle the newline character
        this.daysStay = Integer.parseInt(scanner.nextLine());

        // Update dog spaces
        this.dogSpaces--;

        // Calculate amount due
        this.amountDue = this.daysStay * 20.0; // Assuming $20 per day

        System.out.println("Your pet, " + this.petName + ", has been checked in successfully!");
        System.out.println("Dog spaces left: " + this.dogSpaces);
        System.out.println("Amount due: $" + this.amountDue);

        scanner.close();
    }


    public static void main(String[] args) {
        // Creating a Pet object with initial values
        Pet myPet = new Pet("", "", 0, 0, 10, 0); // Assuming 10 dog spaces initially

        // Check in the pet
        myPet.checkIn();
    }

	public int getPetAge() {
		return petAge;
	}

	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}
}
