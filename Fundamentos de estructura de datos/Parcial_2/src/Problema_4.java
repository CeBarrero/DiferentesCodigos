import java.io.*;

public class Problema_4 {
	
	static BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
	static BufferedWriter bw = new BufferedWriter ( new OutputStreamWriter (System.out));
		    
	public static void main(String[] args) throws IOException {
		
		int [] Dias = new int [7];
		bw.write ("Ingrese los precios ");
		bw.flush();

		int i;
		for (i = 0; i < Dias.length; i++) 
		{
			int valor = Integer.parseInt(br.readLine() );
			Dias[i] = valor;
		}
		 
		int menor = Dias[0];
		int mayor = Dias[0];
		int diferencia=0;
		 
		for (int j = 0; j < Dias.length; j++) 
		{
			if(Dias[j] < menor)
			{
			menor = Dias[j];
			}
		}
		System.out.println(menor);
		 
		for (int x = 0; x < Dias.length; x++) 
		{
			if(Dias[x] > mayor){
			mayor = Dias[x];
	    }

		System.out.println(mayor);
		diferencia = mayor - menor;
		 
		System.out.println("La ganancia es de " + diferencia);
		}
	}
}