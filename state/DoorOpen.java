package state;

public class DoorOpen extends DoorState {
    public DoorOpen(Door_2 door) {
        super(door);
    }

    public void click() {
        door.setState(door.STAYOPEN);
    }

    public void timeout() {
        door.setState(door.CLOSING);
    }
}