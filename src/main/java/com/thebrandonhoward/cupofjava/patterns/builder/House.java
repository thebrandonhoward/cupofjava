package com.thebrandonhoward.cupofjava.patterns.builder;

public class House {
    private String color;
    private int numberOfBedrooms;
    private int numberOfBathrooms;
    private boolean hasBasement;

    public static class HouseBuilder {
        private String color;
        private int numberOfBedrooms;
        private int numberOfBathrooms;
        private boolean hasBasement;

        public HouseBuilder color(String color) {
            this.color = color;
            return this;
        }
        public HouseBuilder numberOfBedrooms(int numberOfBedrooms) {
            this.numberOfBedrooms = numberOfBedrooms;
            return this;
        }
        public HouseBuilder numberOfBathrooms(int numberOfBathrooms) {
            this.numberOfBathrooms = numberOfBathrooms;
            return this;
        }
        public HouseBuilder hasBasement(boolean hasBasement) {
            this.hasBasement = hasBasement;
            return this;
        }

    }

}
