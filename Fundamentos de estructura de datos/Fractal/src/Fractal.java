
public class Fractal {

	public int [][] matrix;
	public int [] rule = {0,1,1,1,0,1,1,0};
	
	public Fractal(int width, int heigth, int rule)
	{
		this.matrix = new int [heigth][width];
		//this.rule = new int [8];
		
		this.initialize(width);
		//this.binary_rule(rule, 0);
		this.generate_fractal();
	}
	
	private void initialize(int width)
	{
		for (int j = 0; j < width; j++)
		{
			this.matrix[0][j] = Math.random() < 0.7 ? 0 : 1;
		}
	}
	
	public void binary_rule(int rule, int index)
	{
		if (rule > 1)
		{
			if (rule > Math.pow(2, 7 - index))
			{
				this.rule[index] = 1;
			}
			this.binary_rule(rule, index + 1);
		}
		else
		{
			this.rule[0] = rule;
		}
	}
	
	public void generate_fractal()
	{
		int n = this.matrix[0].length;
		int m = this.matrix.length;
		
		for (int i = 1; i < m; i++) 
		{
			for (int j = 0; j < n; j++) 
			{
				this.matrix[i][j] = this.rule[ (4 * this.matrix[i - 1][(j - 1 + n) % n]) + (2 * this.matrix[i - 1][j]) + (1 * this.matrix[i - 1][(j + 1) % n])];
			}
		}
		for (int j = 0; j < matrix.length; j++) 
		{
			this.matrix[0][j] = this.rule[ (this.matrix[m - 1][(j - 1 + n) % n]) + (2 * this.matrix[m - 1][j]) + (4 * this.matrix[m - 1][(j + 1) % n])];
		}
	}
	
}
