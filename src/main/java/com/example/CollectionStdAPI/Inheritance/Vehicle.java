package com.example.CollectionStdAPI.Inheritance;

class Vehicle {

    String fuel = "Petrol";
    int price = 500000;
    int y = 20;
    void display() {
        System.out.println("Vehical category is"+fuel+" and price is "+price);
    }
     String vihicalState = "MP";
}
class Car extends Vehicle {

    String category ="suv";
    void display() {
        System.out.println("Vehical type is"+fuel+" and price is "+price+"from state"+vihicalState);
    }


}

class BMW extends Car{

    int price = 6000000;
    void displayCategory() {
        System.out.println("Vehical type is"+fuel+" and price is "+price+ " category"+category+ " state"+vihicalState);
    }

}
class Main {
    public static void main(String[] args) {

        Car obj = new Car();
        obj.display();
        BMW obj1 = new BMW();
        obj1.display();
        obj1.displayCategory();


    }
}
