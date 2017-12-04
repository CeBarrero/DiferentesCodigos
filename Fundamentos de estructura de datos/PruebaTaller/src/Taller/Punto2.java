package Taller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Punto2 {

	public static void loadMatrix(int array[][], int minRandom, int maxRandom) 
	{
		minRandom = 0;
		maxRandom = 9;
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < array[i].length; j++) 
			{
				array[i][j] = minRandom - ((int) Math.round((Math.random()) * (minRandom - maxRandom)));
		    }
		}
	}
			
	public static void printMatrix(int array[][])
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
			
	public static void MatrixSpiral(int array[][]){
				
		int m = array.length;
		int inicio = 0;
		int limite = array.length - 1;
		int count = 1;
		int number1;
		while(count <= m * m)
		{
			for (int i = inicio; i <= limite; i++) 
			{
				number1 = array[inicio][i];
				System.out.print("["+number1+"]");
				count++;
			}

			for (int i = inicio+1; i <= limite; i++) 
			{
				number1 = array[i][limite];
				System.out.print("["+number1+"]");
				count++;
			}
				
			for (int i = limite-1; i >= inicio; i--) 
			{
				number1 = array[limite][i];
				System.out.print("["+number1+"]");
				count++;
			}
			
			for (int i = limite-1; i >= inicio+1; i--)
			{
				number1 = array[i][inicio];
				System.out.print("["+number1+"]");
				count++;
			}
		inicio +=1;
		limite -=1;
		}
	}

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
				
		bw.write("Escriba el tamaño de la Matriz \n");
		bw.flush();
				
		int m = Integer.parseInt(br.readLine());
				
		int Matrix [][] = new int [m][m];
		loadMatrix(Matrix, m, m);
		printMatrix(Matrix);
		System.out.println("");
		MatrixSpiral(Matrix);
	}
}