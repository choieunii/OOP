package memento;

import java.util.Map;

public class StateSnapshot {
    public int Hp;
    public int Mp;
    public int[] items;
    public Map map;
    public String position;

    StateSnapshot(int Hp, int Mp, int[] items, Map map, String position) {
        this.Hp = Hp;
        this.Mp = Mp;
        this.items = items;
        this.map = map;
        this.position = position;
    }

    public StateSnapshot createSnapshot(int Hp, int Mp, int[] items, Map map, String position) {
        StateSnapshot snapshot = new StateSnapshot(Hp, Mp, items, map, position);
        return snapshot;
    }
}
