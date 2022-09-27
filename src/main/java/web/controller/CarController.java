package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarDAO;
import web.model.Car;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {
    //    @Autowired
    private final CarDAO carDAO;

    @Autowired
    public CarController(CarDAO carDAO) {

        this.carDAO = carDAO;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("cars", carDAO.index());
        return "cars";
    }
}
