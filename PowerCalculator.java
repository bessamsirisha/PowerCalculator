import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the exponent:");
        double exponent = Scanner.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println(base +"raised to the power of " + exponent + " is: "+ result);
        Scanner.close();
    }
    
}
