package mediator;
/*
* 컴퓨터공학과 2018112021 최은지
* User를 생성해 메시지를 보내는 MediatorPatternDemo
* */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User seri = new User("Park Seri");
        User gildong = new User("Gildong");
        seri.sendMessage("Hi! Park Seri!");
        gildong.sendMessage("Hello! Gildong!");
    }
}
