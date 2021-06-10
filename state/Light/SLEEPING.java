package state.Light;

public class SLEEPING implements State {
    private static SLEEPING sleeping = new SLEEPING();
    private SLEEPING() {}

    public static SLEEPING getInstance() {
        return sleeping;
    }

    @Override
    public void onButtonPushed(Light light) {
        System.out.println("Light On");
        light.setState(ON.getInstance());
    }

    @Override
    public void offButtonPushed(Light light) {
        System.out.println("Light Off");
        light.setState(OFF.getInstance());
    }
}