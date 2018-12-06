import java.util.ArrayList;

public class Configuration {
    private ArrayList<Caisse> caisses = new ArrayList<Caisse>();  // Dénote toutes les caisses du niveau
    private Joueur joueur;
    private Niveau niveau;


    // Un constructeur qui prend en paramètre le niveau et la position initiale du joueur
    public Configuration(Niveau niveau, Position positionJouer){
        this.niveau = niveau;
        joueur = new Joueur(this, positionJouer);
    }

    // Un constructeur par copie
    public Configuration(Configuration config){
        this(config.niveau, config.joueur.getPosition());
    }

    // Pour placer une nouvelle caisse
    public boolean addCaisse(Position pos){
        return caisses.add(new Caisse(this, pos));
    }

    // Permettent de connaître la taille du niveau
    public int getX(){return niveau.getX();}
    public int getY(){return niveau.getY();}

    public Niveau getNiveau(){return niveau;}

    /*
    qui permet de renvoyer l’Element à la position en paramètre : le Joueur,
    une Caisse, un Mur ou une Case. C’est cette méthode qui sera principalement utilisée ! Celle de
    Niveau renvoie uniquement des informations statiques.
    Celle-ci peut renvoyer toute l’information
    présente dans la configuration, y compris les élément mobiles ; */

    public Element get(Position pos){
        for (Caisse cai: caisses){
            if (cai.getPosition().equals(pos)){
                return cai;
            }
        }
        if (joueur.getPosition().equals(pos)) {
            return joueur;
        }
/*        if(! this.niveau.estVide(pos)){
            return Mur;
        }*/ else{
            return niveau.get(pos);
        }
//    }

    public Joueur getJoueur(){return joueur;}
    public ArrayList<Caisse> getCaisses(){return caisses;}

    // Teste si la case ne contient pas de mur
    public boolean estVide(Position pos){return niveau.estVide(pos);}

    // Pour savoir si la position est une cible
    public boolean estCible(Position pos){return niveau.estCible(pos);}

    // Permet de déplacer le joueur (renvoie true en cas de succès)
    public boolean bougetJoueurVers(Direction direction){
        if(joueur.bougerVers(direction)){
            return true;
        }else{return false;}
    }

    //Permet de savoir si le joueur a gagné ou pas
    //TODO: Victoire !!
    public boolean victoire(){
        for (int i = 0; i < caisses.size(); i++){
            if (! this.estCible(caisses.get(i).getPosition())){
                return false;
            }
        }
        return true;
    }

    public String toString(){
        /* • Mur : #                                                            Un exemple de représentation :
        • Cible : .                                                                     ######
        • Case : " "                                                                    #@$. #
        • Joueur : @, Joueur sur une cible : +                                          ######
        • Caisse : $, Caisse sur une cible : ∗
        */
        return "";
    }

}
