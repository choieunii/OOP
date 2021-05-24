package bridge;
/*컴퓨터공학과 2018112021 최은지*/
public class Triangle extends Shape {

    public Triangle(Color c) {
        super(c); //color를 받아 Shape에 넣는다.
    }
    @Override
    public void applyColor() {
        System.out.print("Triangle filled with color ");
        color.applyColor(); //color를 출력한다.
    }
}