package model;

public class NewtonMethod {

	double p,tol;
	double a[];
	
	NewtonMethod(double[] a1, double x0_1, double tol_1){
		p = x0_1;
		a = a1;
		tol = tol_1;
	}
	
	public double solveRoots(){
		Horner h=new Horner(a);
		double f=1, d;
		while(f>tol){
			h.evaluate(p);
			f = h.val();
			d = h.der();
			p = p - f/d;
		}
		return p;
	}
	
}
