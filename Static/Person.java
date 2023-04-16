public class Person {
    // 아래는 클래스의 필드, 다른 프로그래밍 언어에서는 멤버변수라고 한다
    String name;
    String address;
    boolean isVip;
    static int count = 0;  // static 필드를 클래스 변수라고도 말한다
    
    static // 클래스 필드는 static 블록에서 초기화할 수 있다
    {
        count = 100;
        System.out.println("static block"); // main 메서드보다 먼저 실행되는 것을 알 수 있다
    }

    public void printName()
    {
        System.out.println("내 이름은 " + name);
    }

    public static void printCount()
    {
        // static 메서드 안에서는 static 필드만 사용할 수 있다
        //System.out.println(name);
        System.out.println("count: " + count);
    }
}
