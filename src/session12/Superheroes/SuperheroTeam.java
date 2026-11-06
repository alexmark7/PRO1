package session12.SuperHeroes;

import java.util.ArrayList;

public class SuperheroTeam {
    private String teamName;
    private ArrayList<Superhero> superheroes;

    public SuperheroTeam(String teamName) {
        this.teamName = teamName;
        this.superheroes = new ArrayList<>();
    }

    public void addSuperhero(Superhero superhero) {
        superheroes.add(superhero);
    }

    public void removeSuperhero(Superhero superhero) {
        superheroes.remove(superhero);
    }

    public Superhero[] getSuperheroes() {
        return superheroes.toArray(new Superhero[0]);
    }

    public int getTotalTeamPowerLevel() {
        int total = 0;
        for (Superhero superhero : superheroes) {
            total += superhero.getPowerLevel();
        }
        return total;
    }

    public int getNumberOfElementalHeroes() {
        int count = 0;
        for (Superhero superhero : superheroes) {
            if (superhero instanceof ElementalHero) {
                count++;
            }
        }
        return count;
    }

    public int getNumberOfPhysicalHeroes() {
        int count = 0;
        for (Superhero superhero : superheroes) {
            if (superhero instanceof PhysicalHero) {
                count++;
            }
        }
        return count;
    }

    public int getNumberOfMentalHeroes() {
        int count = 0;
        for (Superhero superhero : superheroes) {
            if (superhero instanceof MentalHero) {
                count++;
            }
        }
        return count;
    }

    public void teamAttack() {
        for (Superhero superhero : superheroes) {
            superhero.attack();
        }
    }

    public void elementalAttack() {
        for (Superhero superhero : superheroes) {
            if (superhero instanceof ElementalHero) {
                ((ElementalHero) superhero).elementalAttack();
            }
        }
    }

    public void physicalAttack() {
        for (Superhero superhero : superheroes) {
            if (superhero instanceof PhysicalHero) {
                ((PhysicalHero) superhero).physicalAttack();
            }
        }
    }

    public void mentalAttack() {
        for (Superhero superhero : superheroes) {
            if (superhero instanceof MentalHero) {
                ((MentalHero) superhero).mentalAttack();
            }
        }
    }

    @Override
    public String toString() {
        return "SuperheroTeam{teamName='" + teamName + "', superheroes=" + superheroes + "}";
    }
}
