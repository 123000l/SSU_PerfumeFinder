package PerfumeFinder.Test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("recommend")
public class RecommendController {
    @GetMapping("test")
    public String header() { return "pageHeader"; }

    @GetMapping("input")
    public String individual1() {return "recommend/input";}

//    private final FileService fileService;


    @GetMapping("/upload")
    public String testUploadForm() {

        return "test/uploadTest";
    }
}
