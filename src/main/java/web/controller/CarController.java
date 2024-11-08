package web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "")
    public String printWelcome(ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota","Corolla",2011));
        cars.add(new Car("Volkswagen","Tuareg",2012));
        cars.add(new Car("Ford","F150",2017));
        cars.add(new Car("Renault","Duster",2022));
        cars.add(new Car("Lada","Kalina",2008));

        model.addAttribute("cars", cars);
        return "cars";
    }

}

