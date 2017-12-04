import java.io.*;

public class Problema_2 {
	
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		
		BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
	    System.out.println("Digite tamaño del arreglo");
	    int top = Integer.parseInt(br.readLine());
	    
	    System.out.println("Digite los valores del arreglo");
	    int array [] = new int [top];
	    int array1[] = new int [top];
	        
	        for (int i = 0; i < array.length; i++) 
	        {
	            array[i] = Integer.parseInt(br.readLine());
	        }
	        
	        for (int i = 0; i < array.length ; i++) {
	        	int Valor = 1;
	            for (int j = 0; j < array.length; j++) 
	            {
	            	if(i!=j)
	            	{
	            		Valor *= array[j];
	            		array1[i] = Valor;
	            	}  
	            }
	        }
	        
	        for (int k = 0; k < array1.length; k++) 
	        {
	        	System.out.println(array1[k]);
	        }
	    }
}