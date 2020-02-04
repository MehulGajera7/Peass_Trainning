class Gen<t>
{
	t a;
	void show()
	{
		System.out.println("Your a value is ="+a);
	}
}
class S
{
	public static void main(String args[])
	{
		Gen<Integer> s1=new Gen<Integer>();
		s1.a=10;
		s1.show();
	}
}