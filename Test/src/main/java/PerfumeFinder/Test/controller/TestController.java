package PerfumeFinder.Test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Test")
public class TestController {

    //First Line
    @GetMapping("first1")
    public String First1Question() {
        return "Question/First/First_1_Question";
    }

    @GetMapping("first2")
    public String First2Question() {
        return "Question/First/First_2_Question";
    }

    @GetMapping("first3")
    public String First3Question() {
        return "Question/First/First_3_Question";
    }

    @GetMapping("first4")
    public String First4Question() {
        return "Question/First/First_4_Question";
    }

    //Second Line
    @GetMapping("second1")
    public String Second1Question() {
        return "Question/Second/Second_1_Question";
    }

    @GetMapping("second2")
    public String Second2Question() {
        return "Question/Second/Second_2_Question";
    }

    @GetMapping("second3")
    public String Second3Question() {
        return "Question/Second/Second_3_Question";
    }

    @GetMapping("second4")
    public String Second4Question() {
        return "Question/Second/Second_4_Question";
    }

    //Third Line
    @GetMapping("third1")
    public String third1Question() {
        return "Question/Third/Third_1_Question";
    }

    @GetMapping("third2")
    public String third2Question() {
        return "Question/Third/Third_2_Question";
    }

    @GetMapping("third3")
    public String third3Question() {
        return "Question/Third/Third_3_Question";
    }

    @GetMapping("third4")
    public String third4Question() {
        return "Question/Third/Third_4_Question";
    }

    //Fourth Line
    @GetMapping("fourth1")
    public String fourth1Question() {
        return "Question/Fourth/Fourth_1_Question";
    }

    @GetMapping("fourth2")
    public String fourth2Question() {
        return "Question/Fourth/Fourth_2_Question";
    }

    @GetMapping("fourth3")
    public String fourthQuestion() {
        return "Question/Fourth/Fourth_3_Question";
    }

    @GetMapping("fourth4")
    public String fourth4Question() {
        return "Question/Fourth/Fourth_4_Question";
    }

    //Result Line
    @GetMapping("ResultA")
    public String ResultA() {
        return "Result/ResultA";
    }

    @GetMapping("ResultB")
    public String ResultB() {
        return "Result/ResultB";
    }

    @GetMapping("ResultC")
    public String ResultC() {
        return "Result/ResultC";
    }

    @GetMapping("ResultD")
    public String ResultD() {
        return "Result/ResultD";
    }
}
