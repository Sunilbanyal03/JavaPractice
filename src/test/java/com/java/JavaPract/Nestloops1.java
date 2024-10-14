package com.java.JavaPract;

public class Nestloops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		for(int i=0;i<4;i++)
		{
			
			System.out.println("");
			for(int j=0;j<4-i;j++) {
				
				n++;
				System.out.print(" "+n);
			}
			
			System.out.println("");
			
		}

System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");	
	
	/*
	 * 1
	 * 2 3
	 * 4 5 6
	 * 7 8 9 10
	 */
	//System.out.println("");
	int t=0;
	for(int k=0;k<4;k++) {
		System.out.println("");
		
		for(int l=0;l<=k;l++) {
			t++;
			System.out.print(" "+t);
	}
		
		System.out.println("");
		}

	
	System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
	
	
	for(int m=1;m<=4;m++) {
		System.out.println("");
		
		for(int o=1;o<=m;o++) {
			
			System.out.print(" "+o);
	}
		
		System.out.println("");
		}
	
}}
