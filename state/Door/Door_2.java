package state.Door;

import java.util.Observable;

public class Door_2 extends Observable {
    public final DoorState CLOSED = new DoorClosed(this);
    public final DoorState OPENING = new DoorOpening(this);
    public final DoorState OPEN = new DoorOpen(this);
    public final DoorState CLOSING = new DoorClosing(this);
    public final DoorState STAYOPEN = new DoorStayOpen(this);
    private DoorState state = CLOSED;

    public void click() {
        state.click();
    }

    public void complete() {
        state.complete();
    }

    protected void setState(DoorState state) {
        this.state = state;
        setChanged();
        notifyObservers();
    }

    public String status() {
        return state.status();
    }

    public void timeout() {
        state.timeout();
    }
}