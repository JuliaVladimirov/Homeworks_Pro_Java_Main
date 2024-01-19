package org.example.zoo;

public class Horses extends Animals {

    private String placeInZoo;


    public Horses(int numOfAnimals, String animalName, int numOfLegs, int numOfWings, String food) {
        super(numOfAnimals, animalName, numOfLegs, numOfWings, food);
        this.placeInZoo = "Sector 3";;
    }

    public void gallop() { // скакать
        System.out.println(super.getAnimalName() + " belongs to the horse squad and likes to gallop.");// horse squad - отряд лошадиных
    }

    public void placeHorses() {
        System.out.println("Our horses live in the big horse corral in " + placeInZoo + ".");// corral - загон
    }

    public String getPlaceInZoo() {
        return placeInZoo;
    }

    public void setPlaceInZoo(String placeInZoo) {
        this.placeInZoo = placeInZoo;
    }
}