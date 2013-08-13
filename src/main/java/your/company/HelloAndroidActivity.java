package your.company;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HelloAndroidActivity extends Activity {

	private EditText firstNumber, secondNumber;
	private TextView total;
	private Button addButton;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_main);

	    firstNumber = (EditText) findViewById(R.id.firstNumber);
	    secondNumber = (EditText) findViewById(R.id.secondNumber);
	    addButton = (Button) findViewById(R.id.addButton);
	    total = (TextView) findViewById(R.id.total);

	    addButton.setOnClickListener(new View.OnClickListener() {
	        @Override
	        public void onClick(View v) {
	            String firstNumberResult = firstNumber.getText().toString();
	            String secondNumberResult = secondNumber.getText().toString();

	            Integer totalResult = Integer.parseInt(firstNumberResult) + Integer.parseInt(secondNumberResult);
	
	            total.setText("Total = " + Integer.toString(totalResult));
	        }
	    });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

	public EditText getFirstNumber() {
		return firstNumber;
	}

	public EditText getSecondNumber() {
		return secondNumber;
	}

	public Button getAddButton() {
		return addButton;
	}

	public TextView getTotal() {
		return total;
	}

    /**
     * Called when the activity is first created.
     * @param savedInstanceState If the activity is being re-initialized after 
     * previously being shut down then this Bundle contains the data it most 
     * recently supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it is null.</b>
     
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(your.company.R.menu.main, menu);
	return true;
    }*/

}

