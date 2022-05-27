package pro.sky.java.course2.calculate.service;

import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements CalculateService {
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(int num1, int num2) {
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;    }

    public String minus(int num1, int num2) {
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;    }

    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;    }

    public String divide(int num1, int num2) {
        if (num2 == 0)
            return "Ошибка! На ноль делить НЕЛЬЗЯ!";
        int result = num1 / num2;
            return num1 + " / " + num2 + " = " + result;        }
    }

