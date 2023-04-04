package PerfumeFinder.Test.controller;

//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("google")
public class LogInController {
    @GetMapping("signup")
    public String signup() { return "LogIn/signup"; }

//    @GetMapping("callback")
//    public String handleGoogleCallback(@AuthenticationPrincipal OAuth2User oauth2User) {
//        // 로그인 성공 시 처리할 코드 작성
//        return "index";
//    }
}

