package com.junit;

public class SqrtNewtonMethod {
      static double sqrt(double c) {
    	  double epsion = 1e-15;
    	  double t = c;
    	  
    	  while (Math.abs(t - c/t) > epsion*t) {
    		  t = (c/t + t) / 2.0;
    	  }
    	return t;  
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result = SqrtNewtonMethod.sqrt(5);
		System.out.println(result);

	}

}
