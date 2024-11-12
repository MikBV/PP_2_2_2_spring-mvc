package web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.Car;
import web.service.CarServiceCar;
import web.service.ServiceCarIntf;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/car")
    public String printWelcome(ModelMap model) {
        ServiceCarIntf carIntf = new CarServiceCar();


        model.addAttribute("cars", carIntf.createFiveCarCollection());
        return "cars";
    }

}

