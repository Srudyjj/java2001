package com.seasons;

public enum Season {

    WINTER(-2),
    SPRING(10),
    SUMMER(20) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(12);

    private final int averageTemperature;

    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
