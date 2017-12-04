package Taller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Punto1 {
	
	public static void loadMatrix(int [][] array, int minRandom, int maxRandom) 
	{
		minRandom = 1;
		maxRandom = 9;
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < array[i].length; j++) 
			{
				array[i][j] = minRandom - ((int) Math.round((Math.random()) * (minRandom - maxRandom)));
		    }
		}
	}
			
	public static void printMatrix(int [][] array)
	{
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < array[i].length; j++) 
			{
				System.out.print("[" + array[i][j] + "]");
		    }
		    System.out.println("");
		}
	}
			
	public static void travelMatrix(int [][] array , int number1)
	{
		if(number1 % 2 == 0)
		{
			for (int i = 0; i < number1; i++) 
			{
				for (int j = 0; j < number1; j++) 
				{
					if((i + j >= (number1 / 2) -1) && (i + (number1 / 2) >= j) && (j + (number1 / 2) >= i) && (i + j <= (number1 / 2)+ number1 -1))
					{
						//array[i][j] = 1;
						System.out.print("[" + array[i][j] + "]");
					}
					else
					{
						array[i][j] = 0;
						System.out.print("   ");
					}
				}
				System.out.println(" ");
			}
		}
		else
		{
			for (int i = 0; i < number1; i++) 
			{
				for (int j = 0; j < number1; j++) 
				{
					if((i + j >= (number1 / 2)) && (i + (number1 / 2) >= j) && (j + (number1 / 2) >= i) && (i + j <= (number1 / 2) + number1 -1))
					{
						System.out.print("[" + array[i][j] + "]");
					}
					else
					{
						array[i][j] = 0;
						System.out.print("   ");
					}
				}
				System.out.println(" ");
			}
		}
	}

	public static void main(String[] args) throws IOException{
				
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
				
		bw.write("Escriba el tamaño de la Matriz \n");
		bw.flush();
				
		int m = Integer.parseInt(br.readLine());
				
		int array [][] = new int [m][m];
				
		loadMatrix(array, m, m);
		printMatrix(array);
				
		System.out.println("");
				
		travelMatrix(array , m);
	}
}