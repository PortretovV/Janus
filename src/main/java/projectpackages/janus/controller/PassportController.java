package projectpackages.janus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import projectpackages.janus.entities.Passport;
import projectpackages.janus.service.PassportService;

@Controller
public class PassportController {

    @Autowired
    private PassportService passportService;

    @RequestMapping(value = "/passport")
    public ModelAndView getPassport(ModelAndView modelAndView){
        Passport passport = new Passport("12AnimalType12");
        modelAndView.addObject("passport", passport);
        return modelAndView;
    }
}
