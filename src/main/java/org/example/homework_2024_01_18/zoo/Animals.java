package org.example.homework_2024_01_18.zoo;

public class Animals {
    private int numOfAnimals;

    private String animalName;


    private int numOfLegs;

    private int numOfWings;

    private String food;

    public Animals() {
    }

    public Animals(int numOfAnimals, String animalName, int numOfLegs, int numOfWings, String food) {
        this.numOfAnimals = numOfAnimals;
        this.animalName = animalName;
        this.numOfLegs = numOfLegs;
        this.numOfWings = numOfWings;
        this.food = food;
    }

    public void describeAnimal() {
        System.out.println("In our zoo we have " + numOfAnimals + " " + animalName + ".");
        System.out.println(animalName + " has " + numOfLegs + " legs, and " + numOfWings + " wings.");
    }

    public void eat() {
        System.out.println(animalName + " eats mostly " + food + ".");
    }

    public static void CountAnimals(Animals[] animals) {
        int sumOfAnimals = 0;
        System.out.println("In our zoo are: ");
        for (int i = 0; i < animals.length; i++) {
            sumOfAnimals += animals[i].getNumOfAnimals();
            System.out.println(animals[i].getAnimalName() + " - " + animals[i].getNumOfAnimals());
        }
        System.out.println("All together we have " + sumOfAnimals + " animals: ");

    }
    public int getNumOfAnimals() {
        return numOfAnimals;
    }

    public void setNumOfAnimals(int numOfAnimals) {
        this.numOfAnimals = numOfAnimals;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    public int getNumOfWings() {
        return numOfWings;
    }

    public void setNumOfWings(int numOfWings) {
        this.numOfWings = numOfWings;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "numOfAnimals=" + numOfAnimals +
                ", animalName='" + animalName + '\'' +
                ", numOfLegs=" + numOfLegs +
                ", numOfWings=" + numOfWings +
                ", food='" + food + '\'' +
                '}';
    }
}







