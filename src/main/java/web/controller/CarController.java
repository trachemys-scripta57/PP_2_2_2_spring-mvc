package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarDAO;
import web.model.Car;

import java.util.List;

@Controller
//@RequestMapping("/cars")
public class CarController {

    private final CarDAO carDAO;

    @Autowired
    public CarController(CarDAO carDAO) {

        this.carDAO = carDAO;
    }

    @GetMapping("cars")
    public String show(@RequestParam(value = "count", required = false) Integer count, Model model) {
//        System.out.println(count);
        List<Car> cars = carDAO.show(count);
        model.addAttribute("cars", cars);

        return "cars";
    }
}
