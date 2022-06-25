import model.Calculator;
import model.CalculatorException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeCalculatorTest {

    @Test(dataProvider = "NegativeCalculatorTest")
    public void negativeTest(String operator, String firstNumber, String twoNumber) {
        System.out.println(Calculator.execute(new String[]{operator, firstNumber, twoNumber}));
    }

        @DataProvider(name = "NegativeCalculatorTest")
    public Object[][] negativeData(){
        return new Object[][]{
                {"+", "-2147483648", "-1"},
                {"+", "2147483647", "1"},
                {"/", "-1.1", "-0.0"},
                {"null", "1.5", "1.2"},
                {"*", "2", ""},
        };
    }
}