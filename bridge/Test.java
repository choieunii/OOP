package bridge;
/*컴퓨터공학과 2018112021 최은지
* 설명은 간단한 주석으로 첨부하였습니다.
* */
public class Test {

    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor()); // Triangle을 RedColor로 생성
        tri.applyColor();

        Shape pent = new Pentagon(new GreenColor()); //Pentagon을 GreenColor로 생성
        pent.applyColor();
    }
}