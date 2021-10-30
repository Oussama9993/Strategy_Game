package personnages;

import strategies.ArmePoignard;

public class Chevalier extends Personnage {
    public Chevalier() {
        this.Arme=new ArmePoignard();
    }

    @Override
    public void combattre() {
        score+=1;
        System.out.println("Je suis un Chevalier");
        this.Arme.utliserArme();
        System.out.println("Score"+score);

    }
}
