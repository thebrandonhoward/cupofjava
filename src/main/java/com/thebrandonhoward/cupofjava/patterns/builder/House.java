package com.thebrandonhoward.cupofjava.patterns.builder;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class House {
    private final String color;
    private final int numberOfBedrooms;
    private final int numberOfBathrooms;
    private final boolean hasBasement;

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

        public House build() {
            return new House(this.color, this.numberOfBedrooms, this.numberOfBathrooms, this.hasBasement);
        }
    }

}
