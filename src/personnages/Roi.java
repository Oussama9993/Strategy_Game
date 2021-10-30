package personnages;

import strategies.ArmePoignard;

public class Roi extends Personnage {
    public Roi() {
        this.Arme=new ArmePoignard();
    }

    @Override
    public void combattre() {
        score+=2;
        System.out.println("Je suis un Roi");
        this.Arme.utliserArme();
        System.out.println("Score"+score);

    }
}
