package web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceCar;
import web.service.ServiceCarIntf;

/**
 * Контроллер для страницы cars
 */
@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars (@RequestParam(value = "count", required = false) Integer count, Model model) {
        ServiceCarIntf carIntf = new CarServiceCar();
        model.addAttribute("cars", carIntf.getNumberOfCars(count != null ? count : 5));
        return "cars";
    }
}

