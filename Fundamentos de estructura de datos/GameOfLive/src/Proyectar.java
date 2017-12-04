import processing.core.PApplet;

public class Proyectar extends PApplet{

	public static void main(String[] args) 
	{
		PApplet.main("Proyectar");
	}
	
	int square_size = 5, width = 60 , height = 70;
	Estructura top = new Estructura(width , height);
	
	public void settings() 
	{
		
		  size(width * square_size , height * square_size);
	}

	public void draw() 
	{
		background(50);
		
		for(int i = 0 ; i< height; i++)
		{
			for(int j = 0; j < width; j++)
			{
				if(top.Cellular_automata[i][j] == 1)
					fill (255,255,255);
				else
					fill (0);
				rect(j * square_size , i * square_size , square_size , square_size);
			}
			try
			{
				Thread.sleep(1);
				top.nextIteration();
			}
			catch(Exception e){e.printStackTrace();}
		}
	}
}