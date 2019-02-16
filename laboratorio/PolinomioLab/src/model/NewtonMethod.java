package model;

public class NewtonMethod {

	double p,tol;
	
	NewtonMethod(){
		p = -2;
		tol = 1e-5;
	}
	
	public double solveRoots(double[] a){
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
