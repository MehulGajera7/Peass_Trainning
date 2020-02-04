import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class ListPractice
{
	public static void main(String args[])
	{
		List<Integer> values=new ArrayList<Integer>();
		List<Integer> values1=new ArrayList<Integer>();
		values.add(10);
		values.add(20);
		values.add(30);
		values.add(40);
		values.add(1);
		values.add(19);
		values1.add(11);
		values1.add(21);
		values1.add(31);
		values1.add(41);
		values1.add(11);
		values1.add(17);
		Collections.sort(values);
		values.forEach(System.out::println);
		Collections.sort(values1);
		for(int i:values1)
		{
			System.out.println(i);
		}
	}
}