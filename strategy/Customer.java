package strategy;

import java.lang.String;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;


/**
 * Represents a customer.
 */
public class Customer {
    public static final int BIG_SPENDER_DOLLARS = 1000;

    /**
     * @return true if this customer has registered (or entered) his or her
     *         preference profile. This method is not actually implemented
     */
    public boolean isRegistered() {
        return false;
    }
    private Advisor getAdvisor(){
        Advisor advisor = null;
        if(advisor==null)
        {
            if(PromotionAdvisor.singleton.hasItem())
            {
                advisor = PromotionAdvisor.singleton;
            }else if(isRegistered()){
                advisor = GroupAdvisor.singleton;
            }else if(isBigSpender()){
                advisor = ItemAdvisor.singleton;
            }else{
                advisor = RandomAdvisor.singleton;
            }
        }
        return advisor;
    }

    /**
     * This method demonstrates that the class can actually find the properties
     * file that lists a strategic promotion. If you set your classpath to
     * include the "oozinoz" directory that you can download from oozinoz.com,
     * this program will find the strategy.dat file that lists a promoted
     * firework. In short it's an example of finding and reading from a
     * properties file.
     */
    public static void main(String[] args) {
        Firework recommendation = new Customer().getRecommended();
        System.out.println("Customer recommendation: " + recommendation.toString());
    }

    /**
     * @return a firework to recommend to this customer.
     */
    public Firework getRecommended() {
        try {
            Properties p = new Properties();
            p.load(ClassLoader.getSystemResourceAsStream("config/strategy.dat"));
            String promotedName = p.getProperty("promote");

            if (promotedName != null) {
                Firework f = Firework.lookup(promotedName);
                if (f != null) return f;
            }
        } catch (Exception ignored) {
        }

        if (isRegistered()) {
            return (Firework) Rel8.advise(this);
        }

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -1);
        if (spendingSince(cal.getTime()) > 1000) return (Firework) LikeMyStuff.suggest(this);

        return Firework.getRandom();
    }

    /**
     * @return the amount of dough this customer has spent with us since the
     *         provided date.
     * @param date Since when?
     */
    public double spendingSince(Date date) {
        return 1000;
    }

    private boolean isBigSpender() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -1);
        return (spendingSince(cal.getTime()) > BIG_SPENDER_DOLLARS);
    }
}