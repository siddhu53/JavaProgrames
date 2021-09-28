import java.util.*;
import java.io.*;

public class collectionClass {
	public static void main(String[] args) throws IOException
	{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Collection values =  new ArrayList();
		
		
		for(int i=0;i<5;i++)
		{
			values.add(Integer.parseInt(br.readLine()));
		}
		
		System.out.println("Values are:");
		
		for(Object i:values)
		{
			System.out.println(i);
		}
		
	}
}
