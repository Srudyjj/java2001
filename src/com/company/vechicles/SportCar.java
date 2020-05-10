package com.company.vechicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {
    private double speed;

    public SportCar(String carClass, Engine engine, Driver driver, String marka) {
        super(carClass, engine, driver, marka);
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "speed=" + speed +
                ", carClass='" + carClass + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                ", marka='" + marka + '\'' +
                '}';
    }
}
