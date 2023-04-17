public class StandardOutput {
    // 매개변수 자료형이 각각 다른 오버로딩
    public void println(boolean b)
    {
        System.out.println(b);
    }
    
    public void println(int i)
    {
        System.out.println(i);
    }

    public void println(double d)
    {
        System.out.println(d);
    }

    public void println(String s)
    {
        System.out.println(s);
    }
}
