// VendingMachine 클래스에는 main 메서드가 없으므로 main 메서드가 있는 App 클래스에서 VendingMachine 인스턴스 생성
public class VendingMachine {
    public String pushProductButton(int menuId)
    {
        System.out.println(menuId + "를 전달받았습니다.");
        return "콜라";
    }
    public static void printVersion()
    {
        System.out.println("v1.0");
    }
}
