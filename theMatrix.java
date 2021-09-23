import java.io.*;
public class theMatrix {
	public static void main(String args[]) throws IOException
	{
		int a[][] = new int[3][3];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<a[0].length;i++)
		{
			for(int j=0;j<a[1].length;j++)
			{
				System.out.println("Row: "+i+" column: "+j);
				a[i][j]=Integer.parseInt(br.readLine());
			}
		}
		
		for(int i=0;i<a[0].length;i++)
		{
			for(int j=0;j<a[1].length;j++)
			{
				System.out.println("Row: "+i+" ,column: "+j+ ", Data.."+a[i][j]);			
			}
		}
	}
}
