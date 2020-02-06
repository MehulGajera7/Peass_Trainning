import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Seth {
	public static void main(String args[]) {
		Set<Integer> s = new HashSet<Integer>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(10);// Its only take Unique value .it will not allow you to enter Duplicate Value

		Set<Integer> values = new TreeSet<Integer>();
		values.add(10);
		values.add(20);
		values.add(30);
		values.add(40);
		values.add(20);

		Set<Emp> ep = new TreeSet<Emp>();
		Emp m1 = new Emp(10);
		ep.add(m1);
		ep.add(new Emp(20));

		/*
		 * Iterator i=s.iterator(); while(i.hasNext()) { System.out.println(i);
		 * System.out.println(i.next()); } System.out.println("By for loop");
		 * s.forEach(System.out::println);
		 */
		for (int j : s) {
			System.out.println(j);// its always gives you random output...so you will not get output in sequence
									// which you enterd beacuse of the hash set
		}
		System.out.println("Values of set Using Tree Set");
		values.forEach(System.out::println);// Set using TreeSet will gives you a orderd Output Set only Contain Uniqe
											// value

		System.out.println("Insert Object in set");
		for (Emp k : ep) {
			System.out.println(k.show());
		}
	}
}

class Emp {
	int a;

	Emp(int a) {
		this.a = a;
	}

	boolean show() {
		System.out.println("Your A value is " + this.a);
		return true;
	}
}