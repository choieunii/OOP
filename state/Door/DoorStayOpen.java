package state.Door;

public class DoorStayOpen extends DoorState {
    public DoorStayOpen(Door_2 door) {
        super(door);
    }

    public void click() {
        door.setState(door.CLOSING);
    }
}
