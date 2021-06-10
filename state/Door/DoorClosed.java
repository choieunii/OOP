package state.Door;

public class DoorClosed extends DoorState {
    public DoorClosed(Door_2 door) {
        super(door);
    }

    public void click() {
        door.setState(door.OPENING);
    }
}
