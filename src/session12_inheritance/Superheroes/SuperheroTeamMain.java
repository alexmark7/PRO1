package session12_inheritance.Superheroes;

public class SuperheroTeamMain {

    public static void main(String[] args) {
        SuperheroTeam team = new SuperheroTeam("The Guardians");
        Superhero hero = new Superhero("Guardian", "Alex", 10);
        FireHero fireHero = new FireHero("Blaze", "Sam", 80, "Fire", 9, 100, true);
        IceHero iceHero = new IceHero("Frost", "Jamie", 70, "Ice", 8, 90, true);
        PhysicalHero physicalHero = new PhysicalHero("Titan", "Chris", 60, 100, 30);
        MentalHero mentalHero = new MentalHero("Mindwave", "Taylor", 90, 95, 500.0);
        Speedster speedster = new Speedster("Flashpoint", "Jordan", 75, 50, 100, 1200.0, true);

        team.addSuperhero(hero);
        team.addSuperhero(fireHero);
        team.addSuperhero(iceHero);
        team.addSuperhero(physicalHero);
        team.addSuperhero(mentalHero);
        team.addSuperhero(speedster);

        System.out.println(team);
        System.out.println("Total power: " + team.getTotalTeamPowerLevel());
        System.out.println("Elemental heroes: " + team.getNumberOfElementalHeroes());
        System.out.println("Physical heroes: " + team.getNumberOfPhysicalHeroes());
        System.out.println("Mental heroes: " + team.getNumberOfMentalHeroes());
        System.out.println("Heroes in the array: " + team.getSuperheroes().length);

        System.out.println("\nTeam attack:");
        team.teamAttack();
        System.out.println("\nElemental attack:");
        team.elementalAttack();
        System.out.println("\nPhysical attack:");
        team.physicalAttack();
        System.out.println("\nMental attack:");
        team.mentalAttack();

        System.out.println("\nIndividual abilities:");
        hero.saveDay();
        fireHero.controlElement();
        fireHero.fireball();
        fireHero.fireShield();
        iceHero.iceBlast();
        iceHero.iceBarrier();
        physicalHero.superStrength();
        physicalHero.superSpeed();
        mentalHero.readMind();
        mentalHero.telekinesis();
        speedster.timeTravel();
        speedster.speedForce();

        team.removeSuperhero(hero);
        System.out.println("\nRemoving Guardian Members:");
        for (Superhero superhero : team.getSuperheroes()) {
            System.out.println(superhero);
        }
    }

}
