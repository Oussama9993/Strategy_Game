package personnages;

import strategies.ArmeArcEtFleche;

public class Reine extends Personnage {
    public Reine() {
        this.Arme=new ArmeArcEtFleche();
    }

    @Override
    public void combattre() {
        score+=4;
        System.out.println("Je suis une Reine");
        this.Arme.utliserArme();
        System.out.println("Score"+score);

    }
}
