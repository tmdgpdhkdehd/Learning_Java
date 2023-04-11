public class App {
    public static void main(String[] args) throws Exception {
        outerloop: // 라벨 이름: outerloop
        for (int i = 0; i < 5; i++) {
            innerloop: // 라벨 이름: innerloop
            for (int j = 0; j < 10; j++) {
                if (i == 3 && j == 1) {
                    break outerloop; // outerloop 반복문을 중지합니다.
                }
                if (i == 0 && j == 3) {
                    continue innerloop; // innerloop 반복문의 다음 반복으로 넘어갑니다.
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}
