package mediator;
/*
* 컴퓨터공학과 2018112021 최은지
* 이름을 저장하고 메시지를 전송하는 User 클래스
* */
public class User {
    private String name;
    public User(String name){
        this.name  = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
