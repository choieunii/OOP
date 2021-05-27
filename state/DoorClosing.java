package state;

public class DoorClosing extends DoorState {
    public DoorClosing(Door_2 door) {
        super(door);
    }

    public void click() {
        door.setState(door.OPENING);
    }

    public void complete() {
        door.setState(door.CLOSED);
    }
}
