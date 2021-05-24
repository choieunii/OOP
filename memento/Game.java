package memento;

import java.util.Stack;

public class Game {

    private Stack<StateSnapshot> snapshots = new Stack<StateSnapshot>();
    //Stack에 스냅샷을 저장한다.

    public void Play() {
        Adventurer adventurer = new Adventurer();
        while(true){
            if (adventurer.getPosition().equals("save")) { // 만약 저장이 필요하면
                snapshots.push(adventurer.createSnapshot()); // 스냅샷을 만들어 내용을 저장한다
            }

            if(adventurer.getHP()<=0){ // HP가 다 없어진다면
                adventurer.restoreSnapshot(snapshots.peek()); // stack에서 스냅샷을 가져와 adventurer에 반영한다.
            }
        }
    }

}
