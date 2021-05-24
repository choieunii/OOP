package mediator;
/*
* 컴퓨터공학과 2018112021 최은지
* 메시지를 출력하는 ChatRoom 클래스. 날짜와 이름, 메시지를 출력한다.
* */
import java.util.Date;

public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date(121,0,31,16,5,46).toString() + " [" + user.getName() + "] : " + message);
    }
}
