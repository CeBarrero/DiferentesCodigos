import java.io.*;

public class Problema_1 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
				
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
				
		System.out.println("Digite tamaño del arreglo");
				
		int Top = Integer.parseInt(br.readLine());
				
		System.out.println("Escriba los numeros dentro del arreglo");
				
		String Number = br.readLine();
				
		String Number1 [] = Number.split(",");
				
		System.out.println("Digite el numero de la diferencia");
		int D = Integer.parseInt(br.readLine());
		int count = 0;
				
		for (int l = 0; l < Number1.length ; l++) {
			for (int h = l; h < Number1.length ; h++) {	
					
				int a = Integer.parseInt(Number1[l]);
				int b = Integer.parseInt(Number1[h]);
				int c = (a - b);
						
				if(Math.abs(c) == Math.abs(D))
				{
					count += 1;
					String Pareja = "(" + Number1[l] + " , " + Number1[h] + ")";
					System.out.println(Pareja);
				}
			}	
		}
		System.out.println("El total de parejas con diferencia es " + count);
	}
}