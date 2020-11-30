package com.thomasgvd.timezonemanager.controllers;

import com.thomasgvd.timezonemanager.models.MyTimeZone;
import com.thomasgvd.timezonemanager.services.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    TimeService timeService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("currentTime", timeService.getCurrentTime(MyTimeZone.PARIS.getValue()));
        return "index";
    }
}
