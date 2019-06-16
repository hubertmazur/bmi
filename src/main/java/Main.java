import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int validation = 0 ;
        while (true) {
            if (validation==3) {
                System.out.println("Wprowadzono trzy razy nie poprawne dane. Program kończy swoje działanie.");
                System.exit(0);
            }
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Wprowadz swoja wagę w [kg]:");
                double weight = scanner.nextDouble();
                System.out.println("Wprowadz swój wzrost w [m]:");
                double height = scanner.nextDouble();

                BMICalculator bmi = new BMICalculator();
                bmi.interpreted(bmi.calculate(weight, height));
                System.out.println(bmi.interpreted(bmi.calculate(weight, height)));


            } catch (InputMismatchException e) {
                System.out.println("Wprowadzono nie poprawne dane. ");
                validation++;
            }
        }




    }
}
//InputMismatchException