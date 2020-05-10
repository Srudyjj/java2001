package com.company.vechicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {

    protected String carClass;
    protected Engine engine;
    protected Driver driver;
    protected String marka;

    public Car(String carClass, Engine engine, Driver driver, String marka) {
        this.carClass = carClass;
        this.engine = engine;
        this.driver = driver;
        this.marka = marka;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carClass='" + carClass + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                ", marka='" + marka + '\'' +
                '}';
    }

    public void printInfo() {
        System.out.println("Car{" +
                "carClass='" + carClass + '\'' +
                engine.toString() +
                driver.toString() +
                ", marka='" + marka + '\'' +
                '}');
    }
}
