package com.company.vechicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {

    private int carrying;

    public Lorry(String carClass, Engine engine, Driver driver, String marka, int carrying) {
        super(carClass, engine, driver, marka);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }


    @Override
    public String toString() {
        return "Lorry{" +
                "carrying=" + carrying +
                ", carClass='" + carClass + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                ", marka='" + marka + '\'' +
                '}';
    }
}
