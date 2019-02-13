package Application;

import java.awt.ActiveEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javafx.event.EventHandler;
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
		TASolution.setText("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+" STEP-BY-STEP SOLUTIONS "+'\n');
		TFGenerated.setEditable(false);
		TASolution.setEditable(false);
		TFValueX.setEditable(false);
	}
	
	/**
	 * this method solve the problem, it call method in the model
	 */
	public void solve() {
	
		TFInput.setText(TFInput.getText().toUpperCase());
	}
	
	/**
	 * this method generate a polynomial with grade n and n values
	 */
	public void generate() {
		
	}
	
	/**
	 * this method show the process step-by-step in a text area
	 */
	public void show(String value) {
				
	}

	public TextField getTFInput() {
		return TFInput;
	}

	public void setTFInput(TextField tFInput) {
		TFInput = tFInput;
	}

	public TextField getTFGenerated() {
		return TFGenerated;
	}

	public void setTFGenerated(TextField tFGenerated) {
		TFGenerated = tFGenerated;
	}

	public TextField getTFValueX() {
		return TFValueX;
	}

	public void setTFValueX(TextField tFValueX) {
		TFValueX = tFValueX;
	}

	public Button getBsolve() {
		return Bsolve;
	}

	public void setBsolve(Button bsolve) {
		Bsolve = bsolve;
	}

	public Button getBGenerate() {
		return BGenerate;
	}

	public void setBGenerate(Button bGenerate) {
		BGenerate = bGenerate;
	}

	public TextArea getTASolution() {
		return TASolution;
	}

	public void setTASolution(TextArea tASolution) {
		TASolution = tASolution;
	}

	
		

}
