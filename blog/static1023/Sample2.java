class TestStatic2
{
    static void print()
    {
        System.out.println("static���\�b�h�ł��B");
    }
}

public class Sample2
{
    public static void main(String[] args)
    {
        TestStatic2 ts1 = new TestStatic2();

        ts1.print();
        TestStatic2.print();
    }
}
