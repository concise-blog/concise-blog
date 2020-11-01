package team.towgrandf.conciseblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: concise-blog
 * @description: 登录控制器
 * @author: WangS
 * @create: 2020-11-01 14:34
 **/
@Controller
@Validated
@RequestMapping("login")
public class LoginController {

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String toLogin(){
        return "login";
    }
}
