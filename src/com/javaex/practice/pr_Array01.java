package com.javaex.practice;

public class pr_Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dataArray[] = new int[] { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };
		int sum = 0;
		int count = 0;
		// 데이타어레이 배열 생성,값
		for (int i = 0;i < dataArray.length; i++) {
			if (dataArray[i] % 3 == 0) {
				count++;
				sum+=dataArray[i];

			}
		}System.out.println("3의배수의 개수 >"+count);
		System.out.println("3의배수의 의 합 >"+sum);
		System.out.println("");
	}

}
