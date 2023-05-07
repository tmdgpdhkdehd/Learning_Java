public class App {
    public static void main(String[] args) throws Exception {
        Book b1 = new Book();
        // b1.price = 100;      private 필드는 직접 접근 불가
        // System.out.prinln(b1.price);

        b1.setName("나의 즐거운 하루");
        b1.setPrice(100);
        System.out.println(b1.getName());
        System.out.println(b1.getPrice());
    }
}
