import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionPractice
{
	public static void main(String args[])
	{
		Collection values=new ArrayList();
		values.add(10);
		values.add("Mehul");
		values.add("Chirag");
		values.add(10.5);
		values.add(7.7f);
		values.add(10l);

		/*Iterator i=new values.iterator();

		while(i.hasNext())
		{
			System.out.println(i.next());
		}*/

		for(Object j:values)
		{
			System.out.println(j);
		}
	}
}
