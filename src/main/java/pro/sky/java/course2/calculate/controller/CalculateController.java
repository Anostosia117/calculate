package pro.sky.java.course2.calculate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculate.service.CalculateService;

import java.util.Objects;

@RestController
@RequestMapping("/calculator")
public class CalculateController {
    private final CalculateService calculateService;

    public CalculateController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }
    @GetMapping
    public  String hello() {
        return calculateService.hello();
    }
    @GetMapping(path = "/plus")
    public String plus(@RequestParam (value = "num1", required = false) Float num1,
                       @RequestParam(value = "num2", required = false) Float num2) {
        if (Objects.isNull(num1)||Objects.isNull(num2))
            return "Внимание! Неправильно заполненное поле!";
        return num1 +" + "+ num2 + " = " + (num1 + num2);   }
    @GetMapping(path = "/minus")
    public String minus(@RequestParam (value = "num1", required = false) Float num1,
                        @RequestParam(value = "num2", required = false) Float num2) {
        if (Objects.isNull(num1)||Objects.isNull(num2))
            return "Внимание! Неправильное заполненно поле!";
        return num1 +" - "+ num2 + " = " + (num1 - num2);    }
    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam (value = "num1",required = false) Float num1,
                           @RequestParam(value = "num2", required = false) Float num2) {
        if (Objects.isNull(num1)||Objects.isNull(num2))
            return "Внимание! Неправильно заполненное поле!";
        return num1 +" * "+ num2 + " = " + (num1 * num2);    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam(value = "num1", required = false) Float num1,
                         @RequestParam(value = "num2", required = false) Float num2) {
        if (Objects.isNull(num1)||Objects.isNull(num2))
            return "Внимание! Неправильно заполненное поле!";
        if (num2 == 0) {
            return "На ноль делить НЕЛЬЗЯ!";
        }
        return num1 +" / "+ num2 + " = " + (num1 / num2);
    }
    }

