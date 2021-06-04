package strategy;

import java.io.*;
import java.util.*;


public class PromotionAdvisor implements Advisor {
    public static final PromotionAdvisor singleton = new PromotionAdvisor();
    private Firework promoted;

    private PromotionAdvisor() {
        try {
            Properties p = new Properties();
            p.load(ClassLoader.getSystemResourceAsStream("config/strategy.dat"));
            String promotedFireworkName = p.getProperty("promote");
            if (promotedFireworkName != null) {
                promoted = Firework.lookup(promotedFireworkName);
            }
        } catch (Exception e) {
        }
    }

    public boolean hasItem() {
        return promoted != null;
    }

    public Firework recommend(Customer c) {
        return promoted;
    }
}