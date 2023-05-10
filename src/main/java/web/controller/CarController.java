package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.services.CarService;
import java.util.List;

@Controller
public class CarController {
    private CarService carService;
    private static final int DEFAULT_SIZE = 5;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        count = ((count == null || count >= 5) ? DEFAULT_SIZE : count);
        List<Car> carsList = carService.getCars(count);
        model.addAttribute("cars_list", carsList);
        return "cars";
    }
}
