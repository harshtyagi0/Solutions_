package q5;

import java.util.Scanner;

public class Main {

	public static double distance(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);
	}

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.print("Enter X1	: ");
		int x1 = scan.nextInt();
		System.out.print("Enter Y1	: ");
		int y1 = scan.nextInt();
		System.out.print("Enter X2	: ");
		int x2 = scan.nextInt();
		System.out.print("Enter Y2	: ");
		int y2 = scan.nextInt();
		System.out.println(Math.round(distance(x1, y1, x2, y2) * 100000.0) / 100000.0);
	}

}
