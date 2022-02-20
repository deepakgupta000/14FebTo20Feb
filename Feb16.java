package com.date15Feb;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Feb16 {

	public static void main(String[] args) {
        FrequencyODDEVEN();
           main();
       StringRepresent();
   }

   private static void FrequencyODDEVEN() {
       // 1.) Find the frequency of odd and even in matrix

       int i, j, count1 = 0, count2 = 0;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number of Row ");
       i = sc.nextInt();
       System.out.println("Enter number of column ");
       j = sc.nextInt();
       int a[][] = new int[i][j];
       System.out.println("Enter all the element oF Matrix ");

       for (int x = 0; x < i; x++) {
           for (int y = 0; y < j; y++) {
               a[x][y] = sc.nextInt();
           }
       }
       System.out.println("Given Matrix is ");
       for (int x = 0; x < i; x++) {
           for (int y = 0; y < j; y++) {
               System.out.print(a[x][y] + " ");
           }
           System.out.println("");
       }
       for (int x = 0; x < i; x++) {
           for (int y = 0; y < j; y++) {
               if ((a[x][y] % 2) == 0) {
                   count1++;
               } else {
                   count2++;
               }
           }
       }
       System.out.println("Even number frequency:" + count1);
       System.out.println("Odd number frequency:" + count2);
   }

   static void printDiagonalSums(int[][] mat, int n)
   // 2.) Find the sum of anti diagonal elements in given matrix
   {
       int principal = 0, secondary = 0;
       for (int i = 0; i < n; i++) {
           for (int j = 0; j < n; j++) {

               if (i == j)
                   principal += mat[i][j];

               if ((i + j) == (n - 1))
                   secondary += mat[i][j];
           }
       }

       System.out.println("Diagonal:"
               + principal);

       System.out.println("Anti Diagonal:"
               + secondary);
   }

   private static void main() {

       int[][] a = {{1, 5, 7},
               {2, 6, 8},
               {5, 8, 2},};

       printDiagonalSums(a, 3);
   }
   private static void StringRepresent(){
          /* 3.) Display the string represented by each row of given matrix.

           Input:["Hello"  "Geekster"]
                 ["Good"  "Day"]
           Output:
           Row 0 : HelloGeekster
           Row 1 : GoodDay             */
       Stream<String> str = Stream.of("Hello","Geekster");
       Stream<String> str1 = Stream.of("Good","Day");
       String res = str.collect(Collectors.joining("","{","}"));
       String res1 = str1.collect(Collectors.joining("","{","}"));
       System.out.println(res);
       System.out.println(res1);

   }

}
