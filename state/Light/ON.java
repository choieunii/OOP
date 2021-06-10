package state.Light;

public class ON implements State {
    private static ON on = new ON();
    private ON() {}

    public static ON getInstance() {
        return on;
    }

    @Override
    public void onButtonPushed(Light light) {
        System.out.println("반응 없음");
    }

    @Override
    public void offButtonPushed(Light light) {
        light.setState(OFF.getInstance());
        System.out.println("Light Off");
    }
}