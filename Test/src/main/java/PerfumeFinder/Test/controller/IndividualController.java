package PerfumeFinder.Test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("individual")
public class IndividualController {

    @GetMapping("test")
    public String header() { return "pageHeader"; }

    @GetMapping("perfume1")
    public String individual1() {return "Individual/perfume1";}
}
