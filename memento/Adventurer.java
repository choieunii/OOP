package memento;

import java.util.Map;

public class Adventurer {

    public int HP;
    public int MP;
    public int[] items;
    public Map map;
    public String position;
    public StateSnapshot CreateSnapshot;

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public int[] getItems() {
        return items;
    }

    public void setItems(int[] items) {
        this.items = items;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public StateSnapshot createSnapshot() {
        StateSnapshot tmp = new StateSnapshot(
                HP,
                MP,
                items,
                map,
                position
        );
        return tmp; // 스냅샷 만들기
    }
    public void restoreSnapshot(StateSnapshot snapshot) {
        this.HP = snapshot.Hp;
        this.MP = snapshot.Mp;
        this.items = snapshot.items;
        this.map = snapshot.map;
        this.position = snapshot.position;
    } // snapshot 받아와서 adventurer에 반영

}
