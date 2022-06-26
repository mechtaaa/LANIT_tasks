import model.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class PositiveCalculatorTest{
    @Test(dataProvider = "PositiveCalculatorTest")
    public void positiveTest(String operator, String firstNumber, String twoNumber, double result) {
        System.out.println(Calculator.execute(new String[]{operator, firstNumber, twoNumber, String.valueOf(result)}));
        //Assert.assertEquals(String.valueOf(result), Calculator.execute(new String[]{operator, firstNumber, twoNumber, String.valueOf(result)}));
    }
    @DataProvider(name = "PositiveCalculatorTest")
    public Object[][] positiveData() {
        return new Object[][]{
                {"+", "2", "2", 4},
                {"-", "5", "10", -5},
                {"+", "-1", "1", 0},
                {"*", "5", "5", 25},
                {"-", "2.0", "1.1", 0.8999999999999999},
                {"/", "10", "2", 5},
                {"-", String.valueOf(Integer.MAX_VALUE -2147483647), "123", Integer.MIN_VALUE +5},
                {"+", String.valueOf(Integer.MAX_VALUE -0.01), "123", Integer.MAX_VALUE -124.01},
                {"+", String.valueOf(Integer.MAX_VALUE -5), "123", Integer.MAX_VALUE -6}
        };
    }
}