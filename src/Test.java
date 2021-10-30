import personnages.Chevalier;
import personnages.Personnage;
import personnages.Reine;
import personnages.Roi;
import strategies.ArmeHache;
import strategies.ArmePoignard;

public class Test {
    public static void main(String[] args){
        Personnage reine=new Reine();
        reine.combattre();
        Personnage roi=new Roi();
        roi.combattre();
        System.out.println("-----------");
        roi.setArme(new ArmeHache());
        roi.combattre();
        Personnage chevalier=new Chevalier();
        chevalier.combattre();


    }
}
