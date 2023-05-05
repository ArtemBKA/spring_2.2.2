package web.services;

import org.springframework.stereotype.Component;
import web.models.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{
    List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car(false, 1111, "VAZ 2101"));
        cars.add(new Car(false, 2222, "VAZ 2102"));
        cars.add(new Car(false, 3333, "VAZ 2103"));
        cars.add(new Car(false, 4444, "VAZ 2104"));
        cars.add(new Car(false, 5555, "VAZ 2105"));
    }

    @Override
    public List<Car> getCars(int size) {
        return cars.stream().limit(size).toList();
    }


}
