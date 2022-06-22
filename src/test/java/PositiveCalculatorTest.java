
import model.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class PositiveCalculatorTest{

    @Test(dataProvider = "PositiveCalculatorTest")
    public void positiveTest(String operator, String firstNumber, String twoNumber, double result){
        Calculator.execute(new String[]{operator,firstNumber,twoNumber, String.valueOf(result)});
    }
    @DataProvider (name = "PositiveCalculatorTest")
    public Object[][] pozitiveData() {

        return new Object[][]{
                {"*", "2", "2", 5.0},
                {"-", "1.2", "1.3", 1.5},
                {"+", "1", "1", 2.0},
                {"/", "8", "2", 4.0},
                {"+", "0.5", "0.3", 0.8},
                {"-", String.valueOf(Integer.MAX_VALUE-0.02),"100", Integer.MAX_VALUE-100.02},
                {"+", "0.5", "0.1", 0.59}
        };
    }

}