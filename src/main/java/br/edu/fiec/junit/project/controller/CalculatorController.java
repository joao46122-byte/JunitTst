package br.edu.fiec.junit.project.controller;

import br.edu.fiec.junit.project.service.CalculatorService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@AllArgsConstructor
@RequestMapping("calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "add",
            produces = APPLICATION_JSON_VALUE)
    public Float add(Float x, Float y) {
        return calculatorService.add(x, y);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "subtract",
            produces = APPLICATION_JSON_VALUE)
    public Float subtract(Float x, Float y) {
        return calculatorService.subtract(x, y);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "division",
            produces = APPLICATION_JSON_VALUE)
    public Float division(Float x, Float y) {
        return calculatorService.division(x, y);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "multiplication",
            produces = APPLICATION_JSON_VALUE)
    public Float multiplication(Float x, Float y) {
        return calculatorService.multiplication(x, y);
    }
}
