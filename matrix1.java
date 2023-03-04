package homeworkto10_3;
import java.util.*;
public class matrix1 {
	public static Scanner input=new Scanner(System.in);
	public static double posAvg2(int[][] m)
	{
		int rows = m.length;
		int cols = m[0].length;
		int sum = 0;
		int counter=0;

		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < cols; j++)
			{
				if(m[i][j]>0) {
					sum += m[i][j];
					counter++;
				}
			}
		}
	return (double)sum / counter;
	}
	public static double posAvg3(int[][] m)
	{
		int rows = m.length;
		int cols = m[0].length;
		int sum = 0;
		int max=0;
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < cols; j++)
			{
	   		if(m[i][j]>max)
	   		max = m[i][j];
			}
			sum += max;
		}
		return (double)sum / rows;
	}
	public static double posAvg4(int[][] m)
	{
		int rows = m.length;
		int cols = m[0].length;
		int sum = 0;
		int min=m[0][0];
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < cols; j++)
			{
				if(m[i][j]>0&&m[i][j]<min)
					min=m[i][j];
			}
		}
	return (double)sum / rows;
	}

	public static void main(String[] args) {
		
	}

}
