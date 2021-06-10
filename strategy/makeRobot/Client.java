package strategy.makeRobot;

// MovingStrategy

interface MovingStrategy {
    void move();
}
class FlyingStrategy implements MovingStrategy {
    @Override
    public void move() {
        System.out.println("I can fly");
    }
}
class WalkingStrategy implements MovingStrategy {
    @Override
    public void move() {
        System.out.println("I vsn only walk");
    }
}

//AttackStrategy

interface AttackStrategy {
    void attack();
}
class MissileStrategy implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("I have Missile and can attack with it.");
    }
}
class PunchStrategy implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("I have strong punch and can attack with it.");
    }
}

//Robot

abstract class Robot {
    private String name;
    private MovingStrategy movingStrategy;
    private AttackStrategy attackStrategy;

    public void setMovingStrategy(MovingStrategy movingStrategy) {
        this.movingStrategy = movingStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attack() {
        attackStrategy.attack();
    }
    public void move() {
        movingStrategy.move();
    }
}
class Atom extends Robot {
    public Atom(String name) {
        super(name);
    }
}
class TaeKwonV extends Robot {

    public TaeKwonV(String name) {
        super(name);
    }
}

// Client

public class Client {
    public static void main(String[] args) {
        Robot taeKwonV = new TaeKwonV("TaeKwonV");
        Robot atom = new Atom("Atom");

        taeKwonV.setMovingStrategy(new WalkingStrategy());
        taeKwonV.setAttackStrategy(new MissileStrategy());

        atom.setMovingStrategy(new FlyingStrategy());
        atom.setAttackStrategy(new PunchStrategy());


        System.out.println("My name is " + taeKwonV.getName());
        taeKwonV.move();
        taeKwonV.attack();

        System.out.println("--------------------");

        System.out.println("My name is " + atom.getName());
        atom.move();
        atom.attack();
    }
}