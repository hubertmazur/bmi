public class BMICalculator implements  Calculator {
   private static String the_result_of_the_calculation;
   private static String the_result_of_the_interpreted;


    @Override
    public String calculate(double weight, double height) {
        double calculateBMI;
        calculateBMI = weight/Math.pow(height, 2);

        the_result_of_the_calculation = String.valueOf(calculateBMI);
        return the_result_of_the_calculation;
    }

    @Override
    public String interpreted(String the_result_to_the_interpreted) {
        double tmp = Double.parseDouble(the_result_to_the_interpreted);
        if (tmp < 18.5 ) {
            the_result_of_the_interpreted = "Masz niedowagę.";
        }
        else  if (tmp >=18.5 && tmp <24.99) {
            the_result_of_the_interpreted = "Masz prawidłową wagę.";
        }
        else if (tmp >= 25.0) {
            the_result_of_the_interpreted = "Masz nadwagę";
        }

        return the_result_of_the_interpreted;
    }
}
