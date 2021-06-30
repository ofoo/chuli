package top.fengyulou.chuli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 登录
 */
@Controller
public class LoginController {
    @GetMapping("/login")
    public String login(){
        return "index";
    }
}
