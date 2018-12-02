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
        Position next = new Position(this.pos.add(direction));
        if (config.estVide(pos.add(direction))){
            this.setPosition(pos.add(direction));
            return true;
        }else if (config.get(next) instanceof Caisse && config.estVide(next.add(direction))){
            next = next.add(direction);
            this.setPosition(pos.add(direction));
            return true;
        }
        return false;
    }

    public ArrayList<Direction> getHistoto(){
        return histo;
    };
}
