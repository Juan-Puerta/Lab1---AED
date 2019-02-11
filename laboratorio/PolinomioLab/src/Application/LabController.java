package Application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class LabController {
	
	@FXML private TextField TFInput;
	@FXML private TextField TFGenerated;
	@FXML private TextField TFSolution;
	@FXML private Button Bsolve;
	@FXML private Button BGenerate;
	@FXML private TextArea TASolution;
	
	public void initialize() {
		TFGenerated.setEditable(false);
		TASolution.setEditable(false);
		TFSolution.setEditable(false);
	}
	
	public void solve() {
		
	}
	
	public void generate() {
		
	}
	
	public void show(String value) {
		TASolution.setText(value+'\n');
		
	}
	
	
	

}
