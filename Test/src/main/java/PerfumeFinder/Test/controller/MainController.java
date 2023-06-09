package PerfumeFinder.Test.controller;

import java.util.logging.*;
import PerfumeFinder.Test.TestApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

@Controller
@RequestMapping("keyword")
public class MainController {

//    Logger logger = Logger.getLogger(TestApplication.class.getName());
//
//    logger.info("Message 1");

    @GetMapping("test")
    public String header() {return "pageHeader"; }

    @GetMapping("case1")
    public String case1() {return "KeyWord/keyword1";}

    @GetMapping("case2")
    public String case2() {return "KeyWord/keyword2";}

    @GetMapping("case3")
    public String case3() {return "KeyWord/keyword3";}

    @GetMapping("case4")
    public String case4() {return "KeyWord/keyword4";}
}
