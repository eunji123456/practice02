package com.javaex.practice;

public class pr_Array03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[]c =new char[]{'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		System.out.print(c);
		System.out.println(" ");
		for(int i=0;i<c.length;i++) {
			char d = ',';
			char e = ' ';
			if(c[i]==e) {
				c[i]=d;
			}
		}
		System.out.print(c);
	}

}
