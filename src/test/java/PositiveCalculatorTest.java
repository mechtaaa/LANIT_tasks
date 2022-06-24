
import model.Calculator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class PositiveCalculatorTest{
    @Test(dataProvider = "PositiveCalculatorTest")
    public void positiveTest(String operator, String firstNumber, String twoNumber, double result) {
        System.out.println(Calculator.execute(new String[] {operator, firstNumber, twoNumber, String.valueOf(result)}));
    }
    @DataProvider(name = "PositiveCalculatorTest")
    public Object[][] positiveData() {
        return new Object[][]{
                {"*", "2", "2", 4},
                {"-", "5", "10", -5},
                {"+", "-1", "1", 0},
                {"/", "8", "2", 4.0},
                {"-", String.valueOf(Integer.MIN_VALUE-0.01), "123", Integer.MAX_VALUE-123.01},
                {"-", String.valueOf(Integer.MAX_VALUE-123), "122.99", Integer.MAX_VALUE-0.01},
                {"-", String.valueOf(Integer.MIN_VALUE+1), "131", Integer.MIN_VALUE +124},
                {"+", "0.5", "0.1", 0.59}
        };
    }
}