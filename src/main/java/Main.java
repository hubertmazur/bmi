import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NegativeValueException {


        int validation = 0 ;
        while (true) {
            if (validation==5) {
                System.out.println("Wprowadzono pięć razy nie poprawne dane. Program kończy swoje działanie.");
                System.exit(0);
            }
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Wprowadz swoja wagę w [kg]:");
                double weight = scanner.nextDouble();
                if (weight <=0) {
                    throw  new NegativeValueException ("Wprowadzono ujemną wagę.");

                }
                System.out.println("Wprowadz swój wzrost w [m]:");
                double height = scanner.nextDouble();
                if (weight <=0) {
                    throw  new NegativeValueException ("Wprowadzono ujemny wzrost.");

                }

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
