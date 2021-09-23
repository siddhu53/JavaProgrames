
public class split {
	public static void main(String args[])
	{
		String sentence="Welcome to the jungle";
		String[] sentenceArray = sentence.split(" ");
		
		String check="";
		int counter=0;
		for(String i:sentenceArray)
		{
			if(i.matches("Welcome"))
			{
				for(int k=i.length()-1;k>=0;k--)
				{
					check+=i.charAt(k);
				}
		 		sentenceArray[counter]=check;
			}
//			
			
//			else if(i.endsWith("gle"))
//			{
//				System.out.println(i);
//			}
//			else if(i.startsWith("th"))
//			{
//				System.out.println(i);
//			}
			counter++;
		}
		
		System.out.println("The Latest Array as follows...");
		
		for(String i:sentenceArray)
		{
			System.out.print(i+" ");
		}
				
	}
}
