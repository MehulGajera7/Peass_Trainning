class GenEras<t extends Number> {
	t a,b,sum1;
	void get(t a,t b)
	{
		this.a=a;
		this.b=b;
	}
	t sum()
	{
		Integer sum = new Integer((a.intValue()+b.intValue()));
		return sum1;
	}

}
class Ge
{
	public static void main(String args[])
	{
		GenEras<Integer> a=new GenEras();
		a.get(10,20);
		System.out.println(a.sum());
	}
}
