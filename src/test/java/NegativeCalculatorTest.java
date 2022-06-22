
import model.Calculator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class NegativeCalculatorTest{

      @Test(dataProvider = "NegativeCalculatorTest")
    public void negativeTest(String operator, String firstNumber, String twoNumber){
        Calculator.execute(new String[]{operator,firstNumber,twoNumber});
      }
    @DataProvider(name = "NegativeCalculatorTest")
    public Object[][] negativeData(String operator, String firstNumber, String twoNumber){
        return new Object[][]{
                {"-", "1", "1" },
                {"+", "-2147483648", "-1"},
                {"+", "2147483647", "1"},
                {"/", "2", "0"},
                {"+", "0.5", "0.3"},
                {"+", String.valueOf(Integer.MAX_VALUE-1),"100"},
                {"-", "one", "two"},
                {" ", " ", " "},
                {"/", "-1.1", "-0.0"}
        };
    }

}