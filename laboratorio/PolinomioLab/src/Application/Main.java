package Application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.Polynomial;

public class Main extends Application {


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
	


	public static void main(String[] args) {
		launch(args);
	}
	
	
	public static double[] randomPolynomial() {
		int n = (int) (Math.random()*10) + 1;
		double[] random = new double[n];
		for(int i=random.length-1; i>=0;i--) {
			random[i] = (double) (Math.random()*50) + 1;
		}

		Polynomial p1 = new Polynomial(random);

		double[] roots = p1.getTheBairstow().Bairstow(random);
		return roots;
		}
	
	
	
	public static double[] foundRoots(String input) {
		String b = " "+input;
		char control = '^';
		char[] numbers = b.toCharArray();
		String n = "";
		
		for (int j = 0; j < numbers.length; j++) {
			if(Character.isDigit(numbers[j])) {
				if(numbers[j-1]!=control) 
					n+=numbers[j]+" ";
				else {
					if(numbers[j-1]=='-') {
						n+= "-"+numbers[j];
					}
				}
			}
		}
		for(char temp : numbers) {
			System.out.print(temp);
		}
		System.out.println("");
		System.out.println("lo que recibe n: "+n);
		System.out.println("");
		String [] stringConstant = n.split(" ");
		for(String temp : stringConstant) {
			System.out.print(temp+" ");
		}
		double[] doubleConstant = new double[stringConstant.length];
		for(int i=doubleConstant.length-1;i>=0;i--) {
			doubleConstant[i] = Double.parseDouble(stringConstant[doubleConstant.length-1-i]);
		}
		Polynomial p1 = new Polynomial(doubleConstant);
		double[] roots = p1.getTheBairstow().Bairstow(doubleConstant);

		return roots;
	}
}
