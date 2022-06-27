import model.Calculator;
import model.CalculatorException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class PositiveCalculatorTest{
    @Test(dataProvider = "PositiveCalculatorTest")
    public void positiveTest(String operator, String firstNumber, String twoNumber, double result) {
        System.out.println(Calculator.execute(new String[]{operator, firstNumber, twoNumber, String.valueOf(result)}));
        Assert.assertEquals(String.format("%.3f",result) , Calculator.execute(new String[]{operator, firstNumber, twoNumber, String.valueOf(result)}),
                String.valueOf(new CalculatorException("Значения не равны")));
    }
    @DataProvider(name = "PositiveCalculatorTest")
    public Object[][] positiveData() {
        return new Object[][]{
                {"+", "2", "2", 4},
                {"-", "5", "10", -5},
                {"+", "-1", "1", 0},
                {"*", "5", "5", 25},
                {"-", "2.0", "1.1", 0.9},
                {"/", "10", "2", 5},
                {"+", String.valueOf(Integer.MAX_VALUE -1), "1", Integer.MAX_VALUE},
                {"-", String.valueOf(Integer.MIN_VALUE +1), "1", Integer.MIN_VALUE},
                {"-", String.valueOf(Integer.MIN_VALUE +1), "1", -2147483648},
        };
    }
}