package observer;
/*컴퓨터공학과 2018112021 최은지
* Observer를 상속받은 ConcreteObserver의 역할을 수행한다.
* update 일어날 시 update 메소드를 수행한다.
* */
import java.util.Observable;
import java.util.Observer; //java Observer 사용

class DogWatcher implements Observer {
    private String name;

    DogWatcher(String nm)
    {
        name=nm;
    }

    public String toString()
    {
        return "Dog Watcher: "+name;
    }

    @Override
    public void update(Observable o, Object action) {
        if(o instanceof DogBot) // Update가 일어날 시 변경이 일어난 dog의 이름과 수행된 action을 출력한다.
        {
            DogBot dog = (DogBot) o;
            System.out.println("** "+name+" observes "+dog.getName()+" "+action);
        }
    }

}
