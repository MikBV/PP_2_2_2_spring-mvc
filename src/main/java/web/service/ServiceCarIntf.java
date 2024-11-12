package web.service;

import web.model.Car;

import java.util.List;

/**
 * Сервисный интерфейс для вызова Car методов и объектов.
 * Два метода для создания единичной машины по конструктору и листа из пяти машин
 */
public interface ServiceCarIntf {
    Car createCar(String make, String model, int year);
    List<Car> createFiveCarCollection();
}
