package strategy;

public class RandomAdvisor implements Advisor {
    /**
     * @param c the customer
     * @return any firework, chosen at random
     */
    public static final RandomAdvisor singleton = new RandomAdvisor();

    private RandomAdvisor() {
    }

    public Firework recommend(Customer c) {
        return Firework.getRandom();
    }
}