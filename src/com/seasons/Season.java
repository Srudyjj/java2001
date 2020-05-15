package com.seasons;

public enum Season {

    WINTER(-2, "Холодное время года"),
    SPRING(10, ""),
    SUMMER(20, "Теплое время года"),
    AUTUMN(12, "");

    private final int averageTemperature;
    private final String description;

    Season(int averageTemperature, String description) {
        this.averageTemperature = averageTemperature;
        this.description = description;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return description;
    }
}
