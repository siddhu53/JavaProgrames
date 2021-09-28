import java.util.*;
public class ListOperation {
	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList<>();
		values.add(1);
		values.add(7);
		values.add(9);
		values.add(4);
		values.add(10);
		
		Collections.sort(values);
		
		values.forEach(System.out::println); // Stream API/Lambda function..
		
		//Iterator i = values.iterator();
		
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
//		
//		for(Object j:values)
//		{
//			System.out.println(j);
//		}
	}
}
