class TestClass1
{
    public int a = 0;
    public static int b;
    static class TestStatic4
    {
        public static void print()
        {
            //�G���[:static�N���X����e�N���X�̃C���X�^���X�ϐ��͎Q�Ƃł��Ȃ��B
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
        //�G���[:static�N���X�́A�ʂ̃N���X�Ƃ��Ĉ����邽�߂��̂悤�Ȑ����͂ł��Ȃ��B
        //TestClass1.TestStatic4 ts1 = tc1.new TestStatic4();
        TestClass1.TestStatic4 ts2 = new TestClass1.TestStatic4();

        ts2.print();
        TestClass1.TestStatic4.print();
    }
}
