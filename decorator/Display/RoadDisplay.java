package decorator.Display;


public class RoadDisplay implements Display {
	@Override
	public void draw() {
		System.out.println("기본 도로 표시");
	}
}
