package strategy;

public class Rel8 {
    /**
     * Recommend a nice item for this customer, based on how this customer's
     * taste in music and extreme sports correlates with other customers and
     * with their fireworks preferences.
     * @param c the customer
     * @return a suggested firework
     */
    public static Object advise(Customer c) {
        return new Firework();
    }
}