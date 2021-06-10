package decorator.Display;


public class TrafficDecorator extends DisplayDecorator {
	public TrafficDecorator(Display display) {
		super(display);
	}

	@Override
	public void draw() {
		super.draw();
		this.drawTraffic();
	}

	private void drawTraffic() {
		System.out.println("\t교통량 표시");
	}
}
