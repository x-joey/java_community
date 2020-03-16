package com.example.xiaohua.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * created by xujunwei on 2020/03/15
 */
@Controller
//由于没加responsebody,会出现没错误网页找不到，将结果转换为字符
@ResponseBody
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name") String name , Model model){
        model.addAttribute("name", name);
        return "hello";
    }

}
