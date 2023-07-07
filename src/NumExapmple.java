
public class NumExapmple {

	public static void main(String[] args) {
		/*
		 * 1. +0, -0
		 * 2. Infinity, -Infinity
		 * 3. NaN
		 */
		double d1 = Double.NaN;
		double d2 = 0.0/0.0;		
	
		d1 = d1 * 1000 *2000;
		d2 = d2 * 1000 *2000;
		
		System.out.println("d1=" + d1);
		System.out.println("d2=" + d2);
		
	
	}

}
