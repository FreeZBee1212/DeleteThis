package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private long count;
    @Override
    public List<Car> createCars(){
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


        // Исправил ужас ниже


//        Car car1 = new Car("Toyota", "Red", 3);
//        Car car2 = new Car("BMW", "Green", 5);
//        Car car3 = new Car("Audi", "Black", 8);
//        Car car4 = new Car("Kia", "White", 10);
//        Car car5 = new Car("Lada", "Black", 4);
//        if (count == 1) {
//            list.add(car1);
//        } else if (count == 2) {
//            list.add(car1);
//            list.add(car2);
//        } else if (count == 3) {
//            list.add(car1);
//            list.add(car2);
//            list.add(car3);
//        } else if (count == 4) {
//            list.add(car1);
//            list.add(car2);
//            list.add(car3);
//            list.add(car4);
//        } else if (count >= 5) {
//            list.add(car1);
//            list.add(car2);
//            list.add(car3);
//            list.add(car4);
//            list.add(car5);
//        }
        return listCars;
    }
}