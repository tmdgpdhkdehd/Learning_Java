public class Book {
    private String title;
    private int price;  // price 필드, 정보 은닉을 위해 필드는 private로 접근 제한

    // 필드의 값을 수정하고 얻기 위한 메서드를 만든다
    // getter, setter - 프로퍼티(property)

    // price 프로퍼티
    public int getPrice() {
        return this.price;  // this는 내 자신의 인스턴스를 참조하는 예약어다
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // Name 프로퍼티 (프로퍼티 이름은 필드 이름이 아니라 get set 뒤에 붙는 이름을 가져다 쓴다)
    public String getName() {
        return this.title;
    }

    public void setName(String title) {
        this.title = title;
    }
}
