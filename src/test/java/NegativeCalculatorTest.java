
import model.Calculator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class NegativeCalculatorTest{
    @Test(dataProvider = "NegativeCalculatorTest")
    public void negativeData(String operator, String firstNumber, String twoNumber){
        Calculator.execute(new String[]{operator,firstNumber,twoNumber});
    }

    @DataProvider(name = "NegativeCalculatorTest")
    public Object[][] negativeTest(){
        return new Object[][]{
                {"-", "1", "1 " },
                {"+", "1", "1"},
                {"*", "2", "2"},
                {"/", "2", String.valueOf(0)},
                {"+", "0.5", "0.3"},
                {"+", String.valueOf(Integer.MAX_VALUE-1),"100"},
        };
    }
}