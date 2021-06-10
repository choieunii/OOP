package decorator.Display;

public class CrossingDecorator extends DisplayDecorator {
	public CrossingDecorator(Display display) {
		super(display);
	}

	private void drawCrossing() {
		System.out.println("\t교차로 표시");
	}

	@Override
	public void draw() {
		super.draw();
		this.drawCrossing();
	}
}
