package br.edu.fiec.junit.project.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public Float add(Float x, Float y) {
        return x + y;
    }

    public Float subtract(Float x, Float y) {
        return x - y;
    }

    public Float division(Float x, Float y) {
        if (y == 0)
            throw new ArithmeticException("Division by zero!");
        return x/y;
    }

    public Float multiplication(Float x, Float y) {
        return x * y;
    }
}
