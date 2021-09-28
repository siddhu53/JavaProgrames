import java.util.*;

public class ArrayListClass {
	public static void main(String args[])
	{
		ArrayList<Integer> arr =  new ArrayList<Integer>();
		arr.add(10);
		arr.add(12);
		arr.add(19);
		arr.add(21);
		arr.add(33);
		
		arr.remove(0);
		
		arr.forEach(System.out::println);
		
		System.out.println(arr.size());
		
	}
}
