package Application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class LabController {
	
	@FXML private TextField TFInput;
	@FXML private TextField TFGenerated;
	@FXML private TextField TFValueX;
	@FXML private Button Bsolve;
	@FXML private Button BGenerate;
	@FXML private TextArea TASolution;
	
	public void initialize() {
		TFGenerated.setEditable(false);
		TASolution.setEditable(false);
		TFValueX.setEditable(false);
	}
	
	/**
	 * this method solve the problem, it call method in the model
	 */
	public void solve() {
		
	}
	
	/**
	 * this method generate a polynomial with grade n and n values
	 */
	public void generate() {
		
	}
	
	/**
	 * this method show the process in a text area
	 */
	public void show(String value) {
				
	}
		

}
