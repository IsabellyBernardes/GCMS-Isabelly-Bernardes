package com.example.WebApp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class HomeController {
    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello, World!";
    }
    @RequestMapping("/isabelly")
    public @ResponseBody String greetingFulano() {
        return "Hello, Isabell!";
    }
    @RequestMapping("/vscode")
    public @ResponseBody String greetingIDE() {
        return "Hello, VsCode!";
    }
    @RequestMapping("/intellij")
    public @ResponseBody String greetingIDEIn() {
        return "Hello, IntelliJ!";
    }
}