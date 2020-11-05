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

}
