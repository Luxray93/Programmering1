package uppgift;

import java.util.Scanner;

public class v41_heml�xa {
	
	public static void main(String[] args) {
		System.out.println("Skriv in en radie f�r att f� volymen p� ett klot");
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		System.out.println(volume(x));
		String str = input.next();
	}
	public static double volume(double x){
		
		x = (x*x*x*3.14*4)/3;
		return  x;
	}
	public static String reverse(String str){
		for(int i = str.length() - 1; i>= 0; i--) {
			
		}
	}
}
