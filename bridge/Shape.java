package bridge;
/*컴퓨터공학과 2018112021 최은지*/
public abstract class Shape {
    protected Color color;
    public Shape(Color c){
        this.color=c; //자신의 Color 멤버에 받아온 값을 넣는 생성자
    }
    abstract public void applyColor(); //추상메서드
}