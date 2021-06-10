package strategy.strategy1;

public class ItemAdvisor implements Advisor {
    public static final ItemAdvisor singleton = new ItemAdvisor();
    public Firework recommend(Customer c) {
        return (Firework) LikeMyStuff.suggest(c);
    }
}