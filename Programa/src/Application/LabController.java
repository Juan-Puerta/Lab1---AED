package Application;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

public class LabController {

	private TextField TFInput;
	private Button BSolve;
	private TextField TFGenerated;
	private Button BGenerate;
	private TextField TFValueX;
	private TextArea TASolution;
	
	public void initialize() {
		
	}
	
	public void solve() {
		show("solve");
	}
	
	public void generate() {
		show("generate");
	}
	
	public void show(String value) {
		TASolution.setText(value+'\n');
		System.out.println(value);
	}
}
