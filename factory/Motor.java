package factory;

enum Direction {UP, DOWN}

enum MotorStatus {MOVING, STOPPED}

public abstract class Motor {
    private MotorStatus motorStatus;

    protected abstract void moveMotor(Direction direction);

    public Motor() {
        motorStatus = MotorStatus.STOPPED;
    }

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    private void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus(); // 모터의 상태
        if (motorStatus == MotorStatus.MOVING)
            return; // moving이면 리턴
        moveMotor(direction); //print 하고
        setMotorStatus(MotorStatus.MOVING); // 모터의 상태를 MOVING으로 바꾼다.
    }
    void stop() {
        setMotorStatus(MotorStatus.STOPPED); // stop으로 상태 변경
    }
}

class LGMotor extends Motor {
    protected void moveMotor(Direction direction) {
        System.out.println("move LG Motor " + direction);
    }
}

class HyundaiMotor extends Motor {
    protected void moveMotor(Direction direction) {
        System.out.println("move Hyundai Motor " + direction);
    }
}

class ElevatorController {
    private int id;
    private int curFloor = 1;
    private Motor motor;

    public ElevatorController(int id, Motor motor) {
        this.id = id;
        this.motor = motor;
    } //생성자

    public void gotoFloor(int destination) {
        if (destination == curFloor)
            return; //목적지가 1이면 return

        Direction direction;

        if (destination > curFloor) // 목적지가 1보다 크면
            direction = Direction.UP; //방향을 up으로 설정
        else
            direction = Direction.DOWN; // 방향을 밑으로 설정

        motor.move(direction); // direction으로 이동
        System.out.print("Elevator [" + id + "] floor:" + curFloor);
        curFloor = destination;
        System.out.println(" ==> " + curFloor + " with " + motor.getClass().getName());

        motor.stop();
    }
}
