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

    @GetMapping("perfume2")
    public String individual2() {return "Individual/perfume2";}

    @GetMapping("perfume3")
    public String individual3() {return "Individual/perfume3";}

    @GetMapping("perfume4")
    public String individual4() {return "Individual/perfume4";}

    @GetMapping("perfume5")
    public String individual5() {return "Individual/perfume5";}

    @GetMapping("perfume6")
    public String individual6() {return "Individual/perfume6";}

    @GetMapping("perfume7")
    public String individual7() {return "Individual/perfume7";}

    @GetMapping("perfume8")
    public String individual8() {return "Individual/perfume8";}

    @GetMapping("perfume9")
    public String individual9() {return "Individual/perfume9";}

    @GetMapping("perfume10")
    public String individual10() {return "Individual/perfume10";}

    @GetMapping("perfume11")
    public String individual11() {return "Individual/perfume11";}

    @GetMapping("perfume12")
    public String individual12() {return "Individual/perfume12";}

    @GetMapping("perfume13")
    public String individual13() {return "Individual/perfume13";}

    @GetMapping("perfume14")
    public String individual14() {return "Individual/perfume14";}

    @GetMapping("perfume15")
    public String individual15() {return "Individual/perfume15";}

    @GetMapping("perfume16")
    public String individual16() {return "Individual/perfume16";}

    @GetMapping("perfume17")
    public String individual17() {return "Individual/perfume17";}

    @GetMapping("perfume18")
    public String individual18() {return "Individual/perfume18";}

    @GetMapping("perfume19")
    public String individual19() {return "Individual/perfume19";}

    @GetMapping("perfume20")
    public String individual20() {return "Individual/perfume20";}
}
