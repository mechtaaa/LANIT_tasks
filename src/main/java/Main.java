import model.Calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] params = readParams();
        System.out.println(Calculator.execute(params));
    }

    private static String[] readParams() {
        Scanner in = new Scanner(System.in);
        String operator = in.nextLine();
        String fNumber = in.nextLine();
        String tNumber = in.nextLine();
        String[] params= new String[3];
        params[0]=operator;
        params[1]=fNumber;
        params[2]=tNumber;
        return params;
    }
}