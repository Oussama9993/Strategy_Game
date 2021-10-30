package personnages;

import strategies.Arme;

public abstract class Personnage {
    protected String name;
    protected int score;
    public abstract void combattre();

    public void setArme(strategies.Arme arme) {
        Arme = arme;
    }

    protected Arme Arme;
}
