package com.mindtree.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TriangularMatrix {	

	static int i,j,k,n,m;
	static int[][] a = new int[n][m];
	static int[][] s = new int[n][m];

	public static void main(String args[]) throws IOException
	{

		boolean c = true;
		while(c)
		{
			System.out.println("Enter your Choice");
			System.out.println("1.Input \t 2.Upper Triangle \t 3.Lower Triangle \t 4.Diagonal \t 5.Exit");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int choice = Integer.parseInt(br.readLine());
			switch(choice)
			{

			case 1: s = input();
			break;
			case 2: upper(s);
			break;
			case 3: lower(s);
			break;
			case 4: diagonal(s);
			break;
			case 5: c = false;
			break;
			default : System.out.println("Pls Enter b/w 1 - 5!");

			}		
		}
	}

	private static int[][] input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Matrix Size:");
		n = sc.nextInt();
		m = sc.nextInt();
		int a[][] = new int[n][m];
		System.out.println("Enter the values");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		return a;
	}

	public static void upper(int[][] a)
	{
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				if(j>=i)
					System.out.print(a[i][j]+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void lower(int[][] a)
	{
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				if(j<=i)
					System.out.print(a[i][j]+" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void diagonal(int[][] a)
	{
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				if(i==j)
					System.out.print(a[i][j]+" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}		
}


