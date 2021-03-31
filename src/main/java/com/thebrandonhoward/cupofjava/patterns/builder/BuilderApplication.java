package com.thebrandonhoward.cupofjava.patterns.builder;

public class BuilderApplication {

    public static void main(String... args) {

        System.out.println(
                new House.HouseBuilder()
                        .color("blue")
                        .numberOfBedrooms(3)
                        .numberOfBathrooms(2)
                        .hasBasement(false)
                        .build()
                        .toString() );

    }

}
