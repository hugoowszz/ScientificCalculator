package br.edu.infnet.tp1java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class ScientificCalculatorTests {
    ScientificCalculator calculator;

    @BeforeEach
    void setup() {
         calculator = new ScientificCalculator();
    }

    // ----- Testes de funções trigonométricas -----
    @Test
    void testAddition(){
        // Arrange
        double resultadoEsperado = 3.0;
        // Act
        double resultadoSoma = calculator.add(1,2);
        // Assert
        assertEquals(resultadoEsperado, resultadoSoma);
    }

    @Test
    void testSubtract() {
        // Arrange
        double resultadoEsperado = 4.0;
        double a = 5;
        double b = 1;
        // Act
        double resultadoSubtracao = calculator.subtract(a,b);
        // Assert
        assertEquals(resultadoEsperado, resultadoSubtracao);
    }

    @Test
    void testSquareRootPositive() {
        // Arrange
        double resultadoEsperado = 4.0;
        // Act
        double resultadoRaiz = calculator.squareRoot(16);
        // Assert
        assertEquals(resultadoEsperado, resultadoRaiz);
    }

    @Test
    void testCalcLog() {
        double resultadoEsperado = 2.302585092994046;

        double resultadoLog = calculator.log(10);

        assertEquals(resultadoEsperado, resultadoLog, 0.000000000000001);
    }

    @Test
    void testCalcSin() {
        double resultadoEsperado = 1;

        double resultadoSen = calculator.sin(90);

        assertEquals(resultadoEsperado, resultadoSen);
    }

    // ----- Testes de erro -----

    @Test
    void testSquareRootNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.squareRoot(-1);
        });
    }


    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(1,0);
        });
    }

}
