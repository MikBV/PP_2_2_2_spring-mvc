package web.service;

import web.model.Car;

import java.util.List;

public class CarServiceCar implements ServiceCarIntf {
    @Override
    public Car createCar(String make, String model, int year) {
        return new Car(make, model, year);
    }

    @Override
    public List<Car> createFiveCarCollection() {
        return List.of(createCar("Toyota", "Corolla", 2011),
                createCar("Volkswagen", "Tuareg", 2012),
                createCar("Ford", "F150", 2017),
                createCar("Renault", "Duster", 2022),
                createCar("Lada", "Kalina", 2008));
    }
}
