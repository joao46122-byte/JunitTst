package br.edu.fiec.junit.project.service;

import br.edu.fiec.junit.project.controller.CalculatorController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CalculatorSericeTest {

    @InjectMocks
    private CalculatorService calculatorService;

    @Test
    void shouldAddTwoNumbers() {

    }
}
