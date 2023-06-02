package PerfumeFinder.Test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("color")
public class ColorController {
    @GetMapping("test")
    public String header() { return "pageHeader"; }

    @GetMapping("find")
    public String color() {return "Color/findColor";}
}
