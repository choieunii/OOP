package decorator.Display;


public class LaneDecorator extends DisplayDecorator {
	public LaneDecorator(Display display) {
		super(display);
	}

	@Override
	public void draw() {
		super.draw();
		this.drawLane();
	}

	private void drawLane() {
		System.out.println("\t차선 표시");
	}
}
