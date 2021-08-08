package com.thebrandonhoward.cupofjava.patterns.builder;

public class BuilderApplication {

    public static void main(String... args) {

        House house = new House.HouseBuilder()
                                .color("blue")
                                .numberOfBedrooms(3)
                                .numberOfBathrooms(2)
                                .hasBasement(false)
                                .build();

        System.out.println( house.toString() );

    }

}
