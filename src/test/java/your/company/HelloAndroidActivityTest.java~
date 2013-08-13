import your.company.HelloAndroidActivity;
import your.company.R;
import com.xtremelabs.robolectric.RobolectricTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import static junit.framework.Assert.assertEquals;
import android.os.Bundle;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricTestRunner.class)
public class HelloAndroidActivityTest {

    private HelloAndroidActivity calculator;
	
	@Test
	public void testClickAddButton_withPositiveValues() {
		calculator = new HelloAndroidActivity();
		
		calculator.onCreate(new Bundle());
		
		calculator.getFirstNumber().setText("1");
		calculator.getSecondNumber().setText("2");
		
		calculator.getAddButton().performClick();
		
		assertEquals("Total = 3", calculator.getTotal().getText().toString());
	}
	
	/*@Test
	public void testClickAddButton_withEmptyValue() {
		calculator = new Calculator();
		
		calculator.onCreate(new Bundle());
		
		calculator.getFirstNumber().setText("1");
		calculator.getSecondNumber().setText("");
		
		calculator.getAddButton().performClick();
		
		assertEquals("", calculator.getTotal().getText().toString());
	}*/
}

