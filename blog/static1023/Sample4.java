class TestClass1
{
    public int a = 0;
    public static int b;
    static class TestStatic4
    {
        public static void print()
        {
            //エラー:staticクラスから親クラスのインスタンス変数は参照できない。
            //System.out.println(a);
            System.out.println(b);
        }
    }
}

public class Sample4
{
    public static void main(String[] args)
    {
        TestClass1 tc1 = new TestClass1();
        //エラー:staticクラスは、別のクラスとして扱われるためこのような生成はできない。
        //TestClass1.TestStatic4 ts1 = tc1.new TestStatic4();
        TestClass1.TestStatic4 ts2 = new TestClass1.TestStatic4();

        ts2.print();
        TestClass1.TestStatic4.print();
    }
}
