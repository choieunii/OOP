package state.Light;

public interface State {
    void onButtonPushed(Light light);
    void offButtonPushed(Light light);
}