package org.example.homework_2024_02_20.houses;

public class House implements Comparable<House> {

    private int area;
    private int price;
    private String city;
    private boolean hasFurniture;

    public House(int area, int price, String city, boolean hasFurniture) {
        this.area = area;
        this.price = price;
        this.city = city;
        this.hasFurniture = hasFurniture;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isHasFurniture() {
        return hasFurniture;
    }

    public void setHasFurniture(boolean hasFurniture) {
        this.hasFurniture = hasFurniture;
    }

    @Override
    public String toString() {
        return "\nHouse{" +
                "area=" + area +
                ", city='" + city + '\'' +
                ", price=" + price +
                ", hasFurniture=" + hasFurniture +
                '}';
    }

    @Override
    public int compareTo(House other) {
        if (this.price == other.price) {
            return 0;
        } else if (this.price < other.price) {
            return -1;
        } else {
            return 1;
        }
    }
}

//    Вы автоматизируете бизнес риелторов. у вас есть класс:
//    public class House {
//    int area; //площадь дома
//    int price; // цена
//    String city; // город
//    boolean hasFurniture; //продается с мебелью
//}
////    По умолчанию в вашем информационном хранилище дома сортируются по цене.
