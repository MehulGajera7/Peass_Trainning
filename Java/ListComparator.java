import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class ListComparator
{
	public static void main(String args[])
	{
		List<Integer> val=new ArrayList<Integer>();
		val.add(101);
		val.add(102);
		val.add(600);
		val.add(457);
		val.add(589);
		val.add(608);
		System.out.println("Printing Using Iterator");
		Iterator<Integer> i=val.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("Printing using for each lamda Expression");
		val.forEach(System.out::println);
		System.out.println("Printing using for loop");
		for(int j:val)
		{
			System.out.println(j);
		}
		//Collections.sort(val);
		//System.out.println("Your Sorted Value");
		//val.forEach(System.out::println);
		
		Comparator c=new Comp();
		Collections.sort(val, c);
		System.out.println("Your Sorted Value Using Comparator");
		val.forEach(System.out::println);
	}
}