package PerfumeFinder.Test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("image")
public class ImageController {
    @GetMapping("test")
    public String header() { return "pageHeader"; }

    @GetMapping("find")
    public String color() {return "Image/findImage";}

    @GetMapping("find1")
    public String color1() {return "Image/keyword4/findImage1";}

    @GetMapping("find2")
    public String color2() {return "Image/keyword2/findImage2";}

    @GetMapping("find3")
    public String color3() {return "Image/keyword3/findImage3";}

    @GetMapping("find4")
    public String color4() {return "Image/keyword2/findImage4";}

    @GetMapping("find5")
    public String color5() {return "Image/keyword1/findImage5";}

    @GetMapping("find6")
    public String color6() {return "Image/keyword3/findImage6";}

    @GetMapping("find7")
    public String color7() {return "Image/keyword1/findImage7";}

    @GetMapping("find8")
    public String color8() {return "Image/keyword1/findImage8";}

    @GetMapping("find9")
    public String color9() {return "Image/keyword2/findImage9";}

    @GetMapping("find10")
    public String color10() {return "Image/keyword3/findImage10";}

    @GetMapping("find11")
    public String color11() {return "Image/keyword4/findImage11";}

    @GetMapping("find12")
    public String color12() {return "Image/keyword2/findImage12";}

    @GetMapping("find13")
    public String color13() {return "Image/keyword3/findImage13";}

    @GetMapping("find14")
    public String color14() {return "Image/keyword1/findImage14";}

    @GetMapping("find15")
    public String color15() {return "Image/keyword2/findImage15";}

    @GetMapping("find16")
    public String color16() {return "Image/keyword1/findImage16";}

    @GetMapping("find17")
    public String color17() {return "Image/keyword4/findImage17";}

    @GetMapping("find18")
    public String color18() {return "Image/keyword1/findImage18";}

    @GetMapping("find19")
    public String color19() {return "Image/keyword4/findImage19";}

    @GetMapping("find20")
    public String color20() {return "Image/keyword3/findImage20";}
}
