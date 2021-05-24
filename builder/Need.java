package builder;

public class Need {
    public static void main(String[] args) {

        User user = new User.Builder("최","은지")
                .age(20)
                .address("의정부")
                .phone("2222222")
                .build();

    }
}
