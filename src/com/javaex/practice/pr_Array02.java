package com.javaex.practice;

import java.util.Scanner;

public class pr_Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int scoreArray[] = new int[5];
		double sum = 0;
		for (int i = 0; i < 5; i++) {
			int in = sc.nextInt();
			scoreArray[i] = in;
			sum += in;
		}
		System.out.println("����� " + sum / (double) scoreArray.length + " �Դϴ�. ");
		sc.close();
	}

}
