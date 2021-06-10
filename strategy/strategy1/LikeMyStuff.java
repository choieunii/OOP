package strategy.strategy1;

public class LikeMyStuff {
    /**
     * @return Recommend a nice item for this customer, based on his or her
     *         previous purchases.
     * @param c the customer
     */
    public static Object suggest(Customer c) {
        return new Firework();
    }
}
