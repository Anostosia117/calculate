package pro.sky.java.course2.calculate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public int plus(@RequestParam ("num1") int num1, @RequestParam("num2") int num2) {
        return calculateService.plus(num1, num2);
    }
    @GetMapping(path = "/minus")
    public int minus(@RequestParam ("num1") int num1, @RequestParam("num2") int num2) {
        return calculateService.minus(num1, num2);
    }
    @GetMapping(path = "/multiply")
    public int multiply(@RequestParam ("num1") int num1, @RequestParam("num2") int num2) {
        return calculateService.multiply(num1, num2);
    }
    @GetMapping(path = "/divide")
    public int divide(@RequestParam ("num1") int num1, @RequestParam("num2") int num2) {
        return calculateService.divide(num1, num2);
    }
}
