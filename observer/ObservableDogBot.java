package observer;
/* 컴퓨터공학과 2018112021 최은지
* Subject 역할, notifyObserver를 수행하기위해 제작된 클래스
* 이를위해 Observable 및 DogBot을 상속받아 구현되었다.
* */
import java.util.Observable; //java Observable 사용

public class ObservableDogBot extends Observable implements DogBot{
    private DogBot dogbot;
    public ObservableDogBot (DogBot dogbot) {
        this.dogbot = dogbot;
    }

    @Override
    public boolean eat() {
        if(dogbot.eat()){
            setChanged();
            notifyObservers("eat"); //각각 변화가 일어날 시 setChanged를 수행후 notifyObservers를 하게 된다. 이때 arg로 각 메서드 이름을 넘겨 출력한다.
            return true;
        }
        else
            return false;
    }

    @Override
    public void rest() {
        dogbot.rest();
        setChanged();
        notifyObservers("rest"); //각각 변화가 일어날 시 setChanged를 수행후 notifyObservers를 하게 된다. 이때 arg로 각 메서드 이름을 넘겨 출력한다.
    }

    @Override
    public void play() {
        dogbot.play();
        setChanged();
        notifyObservers("play"); //각각 변화가 일어날 시 setChanged를 수행후 notifyObservers를 하게 된다. 이때 arg로 각 메서드 이름을 넘겨 출력한다.
    }

    @Override
    public String noise() {
        return dogbot.noise();
    }

    @Override
    public String getName() {
        return dogbot.getName();
    }
    @Override
    public String toString()
    {
        return dogbot.toString();
    }
}
