package carassembly;

import java.util.Scanner;

public class carmonitoring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int i=100;
		System.out.println("Enter number of cars brought in:");
		int cars=input.nextInt();
		while( cars<=i) {
			System.out.println("The number of cars entered isn't the one required");
			break;
			}
	}

}
