package state;

public class DoorOpening extends DoorState {
    public DoorOpening(Door_2 door) {
        super(door);
    }

    public void click() {
        door.setState(door.CLOSING);
    }

    public void complete() {
        door.setState(door.OPEN);
    }
}