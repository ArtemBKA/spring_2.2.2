package web.services;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.List;

public interface CarService {
    public List<Car> getCars(int size);
}
