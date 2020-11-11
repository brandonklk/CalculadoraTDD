package Calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp()
    {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown()
    {

    }

    @Test
    @DisplayName("Calculando a soma de dois valores")
    public void CalculateSumTwoNumber()
    {
        //Arrange
        String errorMsg = "A soma dos valores deveria ser 10.";
        Integer expectedValue = 10;
        Integer valueOne = 5;
        Integer valueTwo = 5;
        Integer result;

        //Act
        result = calculator.sumNumber(valueOne, valueTwo);

        //Assert
        assertEquals(expectedValue, result, errorMsg);
    }

    @Test
    @DisplayName("Calculando a subtração de dois valores")
    public void CalculateSubtractionTwoNumber()
    {
        //Arrange
        String errorMsg = "O subtração dos valores deveria ser 0.";
        Integer expectedValue = 0;
        Integer valueOne = 5;
        Integer valueTwo = 5;
        Integer result;

        //Act
        result = calculator.subtractionNumber(valueOne, valueTwo);

        //Assert
        assertEquals(expectedValue, result, errorMsg);
    }

    @Test
    @DisplayName("Calculando a divisão de dois valores")
    public void CalculateDivisionTwoNumber()
    {
        //Arrange
        String errorMsg = "O divisão dos valores deveria ser 1.";
        Integer expectedNumber = 1;
        Integer valueOne = 4;
        Integer valueTwo = 4;
        Integer result;

        //Act
        result = calculator.divisionNumber(valueOne, valueTwo);

        //Assert
        assertEquals(expectedNumber, result, errorMsg);
    }

    @Test
    @DisplayName("Calculando a multiplicação de dois valores")
    public void CalculateMultiplicationTwoNumber()
    {
        //Arrange
        String errorMsg = "O multiplicação dos valores deveria ser 25.";
        Integer expectedValue = 25;
        Integer valueOne = 5;
        Integer valueTwo = 5;
        Integer result;

        //Act
        result = calculator.multiplicationNumber(valueOne, valueTwo);

        //Assert
        assertEquals(expectedValue, result, errorMsg);
    }

}
