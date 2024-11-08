package web.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.Car;
import web.config.WebConfig;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		ApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(WebConfig.class);
		List<String> messages = new ArrayList<>();
		List<Car> cars = applicationContext.getBean(List.class);




		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		messages.add(cars.get(0).toString());
		model.addAttribute("messages", messages);
		return "index";
	}
	
}