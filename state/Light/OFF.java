package state.Light;

public class OFF implements State {
    private static OFF off = new OFF();
    private OFF () {}

    public static OFF getInstance() {
        return off;
    }

    @Override
    public void onButtonPushed(Light light) {
        light.setState(ON.getInstance());
        System.out.println("Light On");
    }

    @Override
    public void offButtonPushed(Light light) {
        System.out.println("반응 없음");
    }
}