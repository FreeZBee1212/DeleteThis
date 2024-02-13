package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCars(int count) {
        List<Car> list = new ArrayList<>();
        Car car1 = new Car("Toyota", "Red", 3);
        Car car2 = new Car("BMW", "Green", 5);
        Car car3 = new Car("Audi", "Black", 8);
        Car car4 = new Car("Kia", "White", 10);
        Car car5 = new Car("Lada", "Black", 4);
        if (count == 1) {
            list.add(car1);
        } else if (count == 2) {
            list.add(car1);
            list.add(car2);
        } else if (count == 3) {
            list.add(car1);
            list.add(car2);
            list.add(car3);
        } else if (count == 4) {
            list.add(car1);
            list.add(car2);
            list.add(car3);
            list.add(car4);
        } else if (count >= 5) {
            list.add(car1);
            list.add(car2);
            list.add(car3);
            list.add(car4);
            list.add(car5);
        }
        return list;
    }
}