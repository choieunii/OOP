package templatemethod.motor;

public class LGMotor extends Motor {
	public LGMotor(Door door) {
		super(door);
	}

	@Override
	protected void moveMotor(Direction direction) {
		System.out.println("엘지 모터");
	}
}
