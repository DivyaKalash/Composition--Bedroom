package com.TheK;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");
        Lamp lamp = new Lamp("American",false,4);
        Ceiling ceiling = new Ceiling("White", 12);
        Bed bed = new Bed("Australian",2,1,1,4);

        BedRoom bedRoom1 = new BedRoom("Keshav",wall1,wall2,wall3,wall4,ceiling,lamp,bed);

        bedRoom1.getBed();
        bedRoom1.getLamp().turnOn();
        System.out.println(lamp.getStyle());

    }
}
