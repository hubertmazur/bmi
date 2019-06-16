import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BMICalculatorTest {
    private BMICalculator bmiCalculator;

    @Before
    public void setup() {
        bmiCalculator = new BMICalculator();
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void negative_weight_given() {
        double weight = -10.0;
        double height = 1.58;

    }

    @Ignore
    @Test
    public void negative_height_given() {
        double weight = 70.0;
        double height = -1.98;
    }


    @Test
    public void BMI_return_underweight() {
        double weight = 10.0;
        double height = 2.0;
        assertEquals("Masz niedowagę.", bmiCalculator.interpreted(bmiCalculator.calculate(weight, height)));
    }


    @Test
    public void BMI_return_correct_value() {
        double weight = 65;
        double height = 1.75;
        assertEquals("Masz prawidłową wagę.", bmiCalculator.interpreted(bmiCalculator.calculate(weight, height)));

    }


    @Test
    public void BMI_return_overweight() {
        double weight = 198;
        double height = 1.75;
        assertEquals("Masz nadwagę", bmiCalculator.interpreted(bmiCalculator.calculate(weight, height)));

    }


}
