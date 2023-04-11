public class App {
    // static 메서드는 클래스 메서드라 부름, 메모리에 미리 올려놓는 것이라서 인스턴스를 생성하지 않아도 사용할 수 있음
    // static 이외의 메서드는 new를 사용해야 클래스가 메모리에 올라가서 인스턴스 될 수 있음
    // JAVA는 main 메서드가 있는 클래스에서 실행됨
    // 클래스 이름은 대문자로 시작하는 게 프로그래밍계의 암묵적 룰
    /*
    <메서드 선언 방법>
    [접근제한자] [static] 리턴type 메서드이름([매개변수, ...])
    {
        실행문
    }
    */
    public static void main(String[] args) throws Exception {
        // App 클래스에서 VendingMachine 클래스를 이용하는 것이므로 App 클래스는 VendingMachine 클래스를 의존하는 것임
        // 의존 관계: App ---> VendingMachine

        // printVersion 메서드는 static이라 인스턴스 생성하지 않아도 됨
        VendingMachine.printVersion();

        /*
        <클래스 인스턴스 구성>
        VendingMachine: 참조타입
        vm1: 참조변수
        new: new 연산자
        VendingMachine(): 생성자
        */
        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();

        String product1 = vm1.pushProductButton(100);
        System.out.println(product1);
        String product2 = vm2.pushProductButton(200);
        System.out.println(product2);
    }
}
