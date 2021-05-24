package bridge;
/*컴퓨터공학과 2018112021 최은지*/
public class Pentagon extends Shape{
    public Pentagon(Color c) {
        super(c);//color를 받아 상위의 Shape에 넣는다.
    }
    @Override
    public void applyColor() {
        System.out.print("Pentagon filled with color ");
        color.applyColor();//color를 출력한다.
    }
}
