/*
 * Controller의 종류가 여러가지
 * 초기화 - 같은 코드
 * 실행 - 다른 코드
 * 마무리 - 같은 코드
 */
public abstract class Controller {
    // protected는 같은 package거나 상속받았을 경우에만 접근 가능하게 하는 접근제한자
    // 여기서는, main에서 execute를 제외하고 다른 메서드를 불러오는 실수를 방지하기 위해 사용
    // final은 오버라이딩을 제한한다, 메서드가 아니라 변수에 사용하면 변수값 수정 금지한다
    // 여기서는, init과 close 메서드는 자식 클래스들이 같은 코드를 공유해야 하는 것이므로 오버라이딩되면 안 되기 때문에 사용
    protected final void init() {
        System.out.println("초기화 하는 코드");
    }

    protected final void close() {
        System.out.println("마무리 하는 코드");
    }

    protected abstract void run(); // 매번 다른 코드

    // 내가 가지고 있는 메서드를 호출
    // 어떤 순서를 가지고 있는데 이런 메서드를 템플릿 메서드라고 한다
    public void execute() {
        this.init();    // this. 생략가능
        this.run();
        this.close();
    }
}
