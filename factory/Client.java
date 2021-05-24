package factory;

public class Client {

    public static void main(String[] args) {
        Motor lgMotor = MotorFactory.createMotor(VendorID.LG);
        ElevatorController controller1 = new ElevatorController(1, lgMotor);
        controller1.gotoFloor(5);
        controller1.gotoFloor(3);

        Motor hyundaiMotor = MotorFactory.createMotor(VendorID.HYUNDAI);
        ElevatorController controller2 = new ElevatorController(1, hyundaiMotor);
        controller2.gotoFloor(4);
        controller2.gotoFloor(6);
    }
}

