package fabstractfactory;

import fabstractfactory.door.Door;
import fabstractfactory.elevator.ElevatorFactory;
import fabstractfactory.elevator.ElevatorFactoryFactory;
import fabstractfactory.motor.Motor;

public class Client {
	public static void main(String[] args) {
		ElevatorFactory factory = ElevatorFactoryFactory.getFactory(VendorId.HYUNDAI);

		Door door = factory.createDoor();
		Motor motor = factory.createMotor();
		motor.setDoor(door);

		door.open();
		//motor.move(Direction.UP);
	}
}
