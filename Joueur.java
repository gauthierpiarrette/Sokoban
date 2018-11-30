import java.util.ArrayList;

public class Joueur extends Mobile {
    private ArrayList<Direction> histo;                       //pour garder l’historique des coups joués par le joueur.

    public Joueur(Configuration config, Position pos){
        super(Type.JOUEUR, config, pos);
    }

    public Joueur(Configuration config, Joueur joueur){
        this(config, joueur.getPosition());
    }

    //TODO: Difficult conditions !! review them carefully
    public boolean bougerVers(Direction direction){
        /*
        if (config.estVide(pos.add(direction)) || ){

        }
        */
    }

    public ArrayList<Direction> getHistoto(){
        return histo;
    };
}
