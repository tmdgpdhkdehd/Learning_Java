// 같은 이름을 가진 클래스를 모두 import해서 사용하려고 하면 어떤 package의 클래스를 사용할지 알 수 없게 되므로 오류가 난다
import com.example.util.Calculator;
//import com.example.util2.Calculator;

public class App {
    public static void main(String[] args) throws Exception {
        Calculator cal = new Calculator();
        int value = cal.plus(10, 100);
        System.out.println(value);
        
        // 굳이 쓰고 싶으면 클래스명 앞에 패키지명까지 붙여서 사용한다
        com.example.util2.Calculator cal2 = new com.example.util2.Calculator();
        int value2 = cal2.divide(100, 50);
        System.out.println(value2);
    }
}
