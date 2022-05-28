package pro.sky.java.course2.calculate.service;

import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements CalculateService {
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public float plus(float num1, float num2) {
        float result = num1 + num2;
        return result;    }

    public float minus(float num1, float num2) {
        float result = num1 - num2;
        return result;    }

    public float multiply(float num1, float num2) {
        float result = num1 * num2;
        return result;    }

    public float divide(float num1, float num2) {
        float result = num1 / num2;
            return result;  }
    }

