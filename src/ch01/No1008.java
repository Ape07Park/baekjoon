package ch01;

import java.util.Scanner;

public class No1008 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double A = scan.nextInt() , B = scan.nextInt();
		if(A > 0 && B < 10) {
			System.out.println(A / B);
		}
	}
}
