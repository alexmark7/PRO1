package session12_inheritance.Superheroes;

public class Speedster extends PhysicalHero {
    private double maxSpeed;
    private boolean timeDilation;

    public Speedster(String heroName, String secretIdentity, int powerLevel, int strength, int speed, double maxSpeed, boolean timeDilation) {
        super(heroName, secretIdentity, powerLevel, strength, speed);
        this.maxSpeed = maxSpeed;
        this.timeDilation = timeDilation;
    }

    public void timeTravel() {
        System.out.println(heroName + (timeDilation ? " travels through time!" : " cannot travel through time."));
    }

    public void speedForce() {
        System.out.println(heroName + " uses the speed force at up to " + maxSpeed + "!");
    }
}
