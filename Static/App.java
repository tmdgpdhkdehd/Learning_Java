public class App {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person();
        Person p2 = new Person();
        
        p1. name = "홍길동";
        p1.address = "일산";
        p1.isVip = true;

        p2.name = "조조";
        p1.address = "서울";

        /*
        System.out.println(Person.count);
        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p1.count);
        System.out.println(p2.count);
        p1.count++;
        System.out.println(p1.count);
        System.out.println(p2.count);  // p2.count도 1 증가됨
        p2.count++;
        System.out.println(p1.count);  // p1.count도 1 증가됨
        System.out.println(p2.count);
        System.out.println(Person.count);  // static한 필드는 클래스명.필드명 형식으로 사용하는 것이 좋다
        */

        p1.printName();
        Person.printCount();

        Person.count++;
        Person.printCount();
    }
}
