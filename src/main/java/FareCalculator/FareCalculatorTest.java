package FareCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class FareCalculatorTest {

	@Test
	public void testComputeFare() {
		FareCalculator calculator = new FareCalculator();
	      // Set the values of the form fields
        calculator.departProvinceCombo.setSelectedItem("Punjab");
        calculator.departCombo.setSelectedItem("Lahore");
       
        calculator.economy.setSelected(true);
        calculator.arrCombo.setSelectedItem("Islamabad");
        calculator.seatText.setText("2");
        
        // Simulate clicking the Compute Fare button
        calculator.computeFare.doClick();
        
        // Verify that the correct fare is displayed
        String expectedFare = "1000";
        String actualFare = calculator.totalFareText.getText();
        assertEquals(expectedFare, actualFare);
	}

}
