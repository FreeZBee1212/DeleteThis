package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component("carService")
public class CarServiceImpl implements CarService {

    private long count;

    @Override
    public List<Car> createCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Red", 3, ++count));
        cars.add(new Car("BMW", "Green", 5, ++count));
        cars.add(new Car("Audi", "Black", 8, ++count));
        cars.add(new Car("Kia", "White", 10, ++count));
        cars.add(new Car("Lada", "Black", 4, ++count));
        return cars;
    }

    @Override
    public List<Car> getCars(long count) {
        List<Car> listCars = createCars().stream().limit(count).toList();
        return listCars;
    }
}