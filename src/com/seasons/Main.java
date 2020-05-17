package com.seasons;

public class Main {

    public static void main(String[] args) {
        Season preferredSeason = Season.SUMMER;
        printPreferredSeason(preferredSeason);
        printSeasonInfo(preferredSeason);
        System.out.println();

        for (Season season : Season.values()) {
            printSeasonInfo(season);
        }

        Season season2 = Season.valueOf("WINTER");
        System.out.println(season2);
    }

    public static void printPreferredSeason(Season season) {
        String seasonName;

        switch (season) {
            case WINTER:
                seasonName = "зиму";
                break;
            case SPRING:
                seasonName = "весну";
                break;
            case SUMMER:
                seasonName = "лето";
                break;
            case AUTUMN:
                seasonName = "осень";
                break;
            default:
                seasonName = "все сезоны";
                break;
        }

        System.out.println("Я люблю " + seasonName);
    }

    public static void printSeasonInfo(Season season) {
        System.out.println(
                String.format("Имя: %s, Средняя температура: %s, Описание: %s;",
                        season.name(), season.getAverageTemperature(), season.getDescription()));
    }
}
