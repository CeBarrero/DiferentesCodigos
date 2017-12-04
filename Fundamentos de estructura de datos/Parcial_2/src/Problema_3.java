import java.io.*;

public class Problema_3 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
		System.out.println("Digite tamaño del arreglo");
		int Top = Integer.parseInt(br.readLine() );
			
		int Top1 [] = new int [Top] ;
			
		System.out.println("Escriba los numeros dentro del arreglo");
			
		for (int i = 0; i <  Top1.length; i++) 
		{
			Top1[i] = Integer.parseInt(br.readLine() ); 
		}
			
		int aux2 = 0;
			
		for (int i = 0; i < Top1.length; i++) 
		{
			for (int j = 0; j < Top1.length; j++) 
			{
				if(!(Top1[i] == Top1[j]))
				{
					aux2 = Top1[j];
				}
			}
		}
			System.out.println("El Numero que no se repite es "	+ aux2);
	}
}