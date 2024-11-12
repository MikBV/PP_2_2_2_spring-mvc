package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceCar implements ServiceCarIntf {
    private final List<Car> FIVE_CAR_COLLECTION = new ArrayList<>(List.of(createCar("Toyota", "Corolla", 2011),
            createCar("Volkswagen", "Tuareg", 2012),
            createCar("Ford", "F150", 2017),
            createCar("Renault", "Duster", 2022),
            createCar("Lada", "Kalina", 2008)));

    private Car createCar(String make, String model, int year) {
        return new Car(make, model, year);
    }

    /**
     * Метод интерфейса ServiceCarIntf
     * @param count входящий параметр для указания количества возвращаемых элементов коллекции
     * @return Возврат суб-лист из count значений базовой коллекции
     */
    @Override
    public List<Car> getNumberOfCars(int count) {
        if (count < 5) {
            return FIVE_CAR_COLLECTION.subList(0, count);
        } else {
            return FIVE_CAR_COLLECTION.subList(0, 5);
        }
    }
}
