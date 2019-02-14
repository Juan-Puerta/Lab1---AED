package Application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.Polynomial;

public class Main extends Application {

//	private Polynomial polynomial;
	private static LabController controller;
	public Main() {
		controller = new LabController();
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Pane root = (Pane)FXMLLoader.load(getClass().getResource("Lab.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setTitle("POLYNOMIAL ROOTS");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
//	public Polynomial getPolynomial() {
//		return polynomial;
//	}

//	public void setPolynomial(Polynomial polynomial) {
//		this.polynomial = polynomial;
//	}

	public static void main(String[] args) {
		launch(args);
	}
	
	
	public static double[] randomPolynomial() {
		int n = (int) (Math.random()*10) + 1;
		double[] random = new double[n];
//		String constantValues = "";
		for(int i=random.length-1; i>=0;i--) {
			random[i] = (double) (Math.random()*50) + 1;
//			constantValues += ""+random[i]+" "; 
		}
//		controller.getTFGenerated().setText(constantValues);
		Polynomial p1 = new Polynomial(random);
		//resolver random
		double[] roots = p1.getTheBairstow().Bairstow(random);
		return roots;
		}
	
	
	
	public static double[] foundRoots(String input) {
		String a = " ";
		String b = a+input;
		char control = '^';
		char[] numbers = b.toCharArray();
		String n = "";
		for (int j = 0; j < numbers.length; j++) {
			if(Character.isDigit(numbers[j])) {
				if(numbers[j-1]!=control) 
					n+=numbers[j]+" ";	
			}
		}
		System.out.println(n);
		String [] stringConstant = n.split(" ");
		double[] doubleConstant = new double[stringConstant.length];
		for(int i=doubleConstant.length-1;i>=0;i--) {
			doubleConstant[i] = Double.parseDouble(stringConstant[doubleConstant.length-1-i]);
		}
		Polynomial p1 = new Polynomial(doubleConstant);
		double[] roots = p1.getTheBairstow().Bairstow(doubleConstant);

		return roots;
	}
}
