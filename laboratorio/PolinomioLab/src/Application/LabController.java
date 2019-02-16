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
	@FXML private Button BClear;
	
	
	private static Main main;
	
	public void initialize() {
		TFGenerated.setEditable(false);
		TFValueX.setEditable(false);
	}
	
	/**
	 * this method solve the problem, it call method in the model
	 */
	public  void solve() {
		double[] solution = main.foundRoots(TFInput.getText());
		DecimalFormat df = new DecimalFormat("(#0.00)");
		String roots = "";
		for (int i = 1; i < solution.length; i++) {
			roots += df.format(solution[i])+""+'\t'+" ";
			//TFValueX.setText(df.format(solution[i])+""+'\t');
		}
		roots.substring(0, 1);
		TFValueX.setText(roots);
	}
	
	/**
	 * this method generate a polynomial with grade n and n values
	 */
	public void generate() {
		double[] random = main.randomPolynomial();
		DecimalFormat df = new DecimalFormat("(#0.00)");
		String roots = "";
		for (int i = 1; i < random.length; i++) {
			roots +=  df.format(random[i])+""+'\t'+" ";
		}
		TFValueX.setText(roots);
	}
	
	public void clear() {
		TFInput.setText("");
		TFValueX.setText("");
		TFGenerated.setText("");
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
