package com.semanticsquare.oop;

public class arrayGood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 4; 
		int divisorCount = 0;
		System.out.print("The divisors are " );
		for(int i = 1; i<=x ; i++) {
			if(x % i == 0) {
				divisorCount ++;
				System.out.print(i + " ");
			}
			
		}
		System.out.println(divisorCount);
		int[][] matrix = new int[][] { { 20, 30, 40 }, { 420, 380, 480 } };
		int max = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > max) {
					max = matrix[i][j];
				}
			}
			System.out.println(max);
		}

		int[] dice1 = {10,20,30,40};
		int[] dice2 = {20,42,52,30};
		  for(int i = 0 ; i < dice1.length ;i++) {
			  for(int j = 0 ;j < dice2.length ; j++) {
				  System.out.println(dice1[i] + " " + dice2[j]);
			  }
		  }
				
	}
}
