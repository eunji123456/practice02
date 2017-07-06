package com.javaex.practice;

public class Pr_Array05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Rotto[]= new int[5];
		
		for(int i = 0;i<Rotto.length;i++) {
			Rotto[i]=(int)(Math.random()*45);
			System.out.print(Rotto[i]+" ");
		}
	
	}

}
