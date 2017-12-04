package Taller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Punto4 
{
	public static void loadMatrix(int [][] matrix, int minRandom, int maxRandom) 
	{
		minRandom = 0;
		maxRandom = 9;
		for (int i = 0; i < matrix.length; i++) 
		{
			for (int j = 0; j < matrix[i].length; j++) 
			{
				matrix[i][j] = minRandom - ((int) Math.round((Math.random()) * (minRandom - maxRandom)));
	        }
	    }
	}
		
	public static void printMatrix(int [][] matrix)
	{
		for (int i = 0; i < matrix.length; i++) 
		{
			for (int j = 0; j < matrix[i].length; j++) 
			{
				System.out.print("[" + matrix[i][j] + "]");
	        }
	        System.out.println("");
	    }
	}
		
	public static void main (String[]args) throws IOException{
			
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
			
		bw.write("Escriba el tamaño de la Matriz \n");
		bw.flush();
			
		int m = Integer.parseInt(br.readLine());
			
		int [][] matrix = new int [m][m];
			
		loadMatrix(matrix, m, m);
		printMatrix(matrix);
			
		System.out.println("");
			
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("[" + matrix[j][i] + "]" + "");
			}
			System.out.println("   ");
		}
	}	
}