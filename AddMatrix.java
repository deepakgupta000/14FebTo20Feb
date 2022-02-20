package com.date15Feb;

public class AddMatrix {

public static void addMatrix(int [][]arr1,int [][]arr2){
		
		int m=arr1.length;
		int m1=arr1[0].length;
		int n=arr2.length;
		int [][]result=new int[m][m1];
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				result[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(result[i][j]+" ");
			}System.out.println();
		}
		
		
		
	}
	 
	
	public static void main(String[] args)
	{
		int arr1[][]={{1,3,4},{2,4,3},{3,4,5}};    
		int arr2[][]={{1,3,4},{2,4,3},{1,2,4}}; 
	 
	    addMatrix(arr1,arr2);
	}
}
