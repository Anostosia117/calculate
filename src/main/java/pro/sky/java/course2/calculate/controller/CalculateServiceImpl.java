package pro.sky.java.course2.calculate.controller;

import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements CalculateService {
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public int plus(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public int minus(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    public int multiply(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    public int divide(int num1, int num2) {
        int result = num1 / num2;
        return result;
    }
}
