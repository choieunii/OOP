package state.Door;

import java.util.Observable;

public class Door_1 extends Observable {
    public static final int CLOSED = -1;
    public static final int OPENING = -2;
    public static final int OPEN = -3;
    public static final int CLOSING = -4;
    public static final int STAYOPEN = -5;
    private int state = CLOSED;

    public String status() {
        switch (state) {
            case OPENING:
                return "Opening";
            case OPEN:
                return "Open";
            case CLOSING:
                return "Closing";
            case STAYOPEN:
                return "StayOpen";
            default:
                return "Closed";
        }
    }
    public void complete()
    {
        if (state == OPENING) {
            setState(OPEN);
        }else if(state == CLOSING){
            setState(CLOSED);
        }
    }
    public void timeout()
    {
        if(state == OPEN){
            setState(CLOSING);
        }
    }
    public void click() {
        if (state == CLOSED) {
            setState(OPENING);
        } else if (state == OPENING || state == STAYOPEN) {
            setState(CLOSING);
        } else if (state == OPEN) {
            setState(STAYOPEN);
        } else if (state == CLOSING) {
            setState(OPENING);
        }
    }

    private void setState(int state) {
        this.state = state;
        setChanged();
        notifyObservers();
    }
}