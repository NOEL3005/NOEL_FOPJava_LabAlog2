package com.gl.BusinessTarget;

import java.util.Arrays;
import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of transactional days: ");
		int nod = sc.nextInt();
		int earnings[] = new int[nod];
		System.out.println("Enter the transaction for " + nod + " days");
		for (int i = 0; i < earnings.length; i++) {
			earnings[i] = sc.nextInt();

		}
		System.out.println(Arrays.toString(earnings));

		System.out.println("Enter the total number of targets that needs to be achieved:");
		int targets = sc.nextInt();

		Target tc = new Target();
		tc.targetCheck(earnings, targets);
	}

}
