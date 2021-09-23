

public class FirstApp {
	
	public static void main(String args[])
	{
		String str1="Siddhant";
		String reverse="";
		
		str1=str1.toUpperCase();
		System.out.println(str1);
		
		
		for(int i=str1.length()-1;i>=0;i--)
		{
			reverse += str1.charAt(i);	
		}
		
		reverse=reverse.toLowerCase();
		
		char[] word = new char[reverse.length()];
		
		word=reverse.toCharArray();
		
		for(int i=0;i<word.length;i++)
		{
			if(i==0)
			{
				char c;
				c=word[i];
				word[i]=Character.toUpperCase(c);
			}
		}
		System.out.println(word);	
		
	}
}
