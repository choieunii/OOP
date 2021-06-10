package state.Light;

public class Light {
    private State state;

    public Light() {
        this.state = OFF.getInstance();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void onButtonPushed() {
        state.onButtonPushed(this);
    }

    public void offButtonPushed() {
        state.offButtonPushed(this);
    }
}