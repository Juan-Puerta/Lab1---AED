package Application;

import java.awt.ActiveEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

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
	
	private static Main main;
	
	public void initialize() {
		TASolution.setText("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+" STEP-BY-STEP SOLUTIONS "+'\n');
		TFGenerated.setEditable(false);
		TASolution.setEditable(false);
		TFValueX.setEditable(false);
	}
	
	/**
	 * this method solve the problem, it call method in the model
	 */
	public  void solve() {
		double[] solution = main.foundRoots(TFInput.getText());
		DecimalFormat df = new DecimalFormat("#0.000");
		for (int i = 0; i < solution.length; i++) {
			TFValueX.setText(df.format(solution[i])+""+'\t');
		}
	}
	
	/**
	 * this method generate a polynomial with grade n and n values
	 */
	public void generate() {
		double[] random = main.randomPolynomial();
		 DecimalFormat df = new DecimalFormat("#0.000");
		for (int i = 0; i < random.length; i++) {
			TFValueX.setText(df.format(random[i])+""+'\t');
		}
	}
	
	/**
	 * this method show the process step-by-step in a text area
	 */
	public void show(String value) {
				
	}

	

	public void setTFInput(TextField tFInput) {
		TFInput = tFInput;
	}

	public TextField getTFInput() {
		return TFInput;
	}

	public TextField getTFGenerated() {
		return TFGenerated;
	}

	public TextField getTFValueX() {
		return TFValueX;
	}
	
	




	
		

}
