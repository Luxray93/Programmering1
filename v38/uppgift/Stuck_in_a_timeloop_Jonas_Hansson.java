package uppgift;

import java.util.Scanner;

public class Stuck_in_a_timeloop_Jonas_Hansson {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = 0;
		while(y<x){
			y++;
			System.out.println(y + " Abracadabra");
			
		}
	}

}
