
import model.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class PositiveCalculatorTest{

    @Test (dataProvider = "PositiveCalculatorTest")
    public void pozitiveTest(String operation, String fNumber, String tNumber, double result) {
        Calculator.execute(new String[]{operation,fNumber,tNumber, String.valueOf(result)});
        Assert.assertEquals(result, result);
    }
    @DataProvider (name = "PositiveCalculatorTest")
    public Object[][] pozitiveData() {

        return new Object[][]{
                {"-", "1.2", "1.3", 1.5},
                {"+", "1", "1", 2},
                {"*", "2", "2", 4},
                {"/", "8", "2", 4},
                {"+", "0.5", "0.3", 0.8},
                {"-", String.valueOf(Integer.MAX_VALUE-0.02),"100", Integer.MAX_VALUE-100.02},
                {"+", "0.5", "0.1", 0.59}
        };
    }

}