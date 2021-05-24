package observer;
/*
* 컴퓨터공학과 2018110221 최은지
* DogBot 인터페이스를 상속받아 작성된 PlainDogBot 클래스
* DogBot 메서드의 내용을 수행하며 ConcreteSubject의 역할을 하게된다.
* PlainDogBot의 내용이 바뀔시 ObservableDogBot에서 감지한다.
* */
class PlainDogBot implements DogBot {
    protected int hungry;
    protected int tired;
    protected String name;

    public PlainDogBot(int h, int t, String n) {
        hungry = h;
        tired = t;
        name = n;
    }

    public boolean eat() {
        if (hungry > 6) {
            hungry -= 3;
            return true;
        } else
            return false;
    }

    public void rest() {
        hungry++;
        tired -= 2;
    }

    public void play() {
        hungry += 2;
        tired += 3;
    }

    public String noise() {
        if (hungry > 8 && tired < 11)
            return "whine ";
        else if (tired > 7 && tired > hungry)
            return "snore ";
        else
            return "woof ";
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return "DogBot: "+name;
    }
}
