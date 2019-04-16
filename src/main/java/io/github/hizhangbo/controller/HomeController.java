package io.github.hizhangbo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bob
 * @date 2019-04-14 14:41
 */
@RestController
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/page")
    public String page() {
        return "page";
    }
}
