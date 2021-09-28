import java.util.*;

public class SetClass {
	public static void main(String[] args)
	{
	//	Set<Integer> values = new HashSet<Integer>();
		Set<Integer> values = new TreeSet<Integer>();
		values.add(67);
		values.add(32);
		values.add(77);
		values.add(77);
		
		for(int i:values)
		{
			System.out.println(i);
		}
		
	}
}
