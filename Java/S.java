class Gen<t>
{
	t a,b;
	void set(t a,t b)
	{
		this.a=a;
		this.b=b;
	}
	t show()
	{
		return a+b;
	}
}
class S
{
	public static void main(String args[])
	{
		Gen<Integer> s1=new Gen<Integer>();
		s1.set(10,20);
		System.out.println("Your Sum is ="+s1.show());
	}
}