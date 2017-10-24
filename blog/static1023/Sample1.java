class TestStatic
{
	static int a;
	static int b;

	static void print()
	{
		System.out.println("staticメソッドです。");
	}
}

public class Sample1
{
	public static void main(String[] args)
	{
		TestStatic ts1 = new TestStatic();
		TestStatic ts2 = new TestStatic();

		ts1.a++;
		ts2.a++;

		System.out.println(TestStatic.a);
		System.out.println(TestStatic.b);
	}
}
