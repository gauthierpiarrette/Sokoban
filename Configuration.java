import javafx.geometry.Pos;

import java.util.ArrayList;

public class Configuration {
    private ArrayList<Caisse> caisses;  // Dénote toutes les caisses du niveau
    private Joueur joueur;
    private Niveau niveau;

    // Un constructeur qui prend en paramètre le niveau et la position initiale du joueur
    public Configuration(Niveau niveau, Position positionJouer){
        //TODO: positionJouer initiale ????;
        this.niveau = niveau;
        joueur.setPosition(positionJouer);
    }

    // Un constructeur par copie
    //TODO: position initiale du jouer aussi ??
    public Configuration(Configuration config){
        this(config.niveau, config.joueur.getPosition());
    }

    // Pour placer une nouvelle caisse
    public boolean addCaisse(Position pos){
        //TODO: check it;
        caisses.add(new Caisse(this, pos));
    }

    // Permettent de connaître la taille du niveau
    public int getX(){return niveau.getX();}
    public int getY(){return niveau.getY();}

    public Niveau getNiveau(){return niveau;}

    /*
    qui permet de renvoyer l’Element à la position en paramètre : le Joueur,
    une Caisse, un Mur ou une Case. C’est cette méthode qui sera principalement utilisée ! Celle de
    Niveau renvoie uniquement des informations statiques. Celle-ci peut renvoyer toute l’information
    présente dans la configuration, y compris les élément mobiles ; */
    public Element get(Position pos){
    }

    public Joueur getJoueur(){return joueur;}
    public ArrayList<Caisse> getCaisses(){return caisses;}

    // Teste si la case ne contient pas de mur
    public boolean estVide(Position pos){return niveau.estVide(pos);}

    // Pour savoir si la position est une cible
    public boolean estCible(Position pos){return niveau.estCible(pos);}

    // Permet de déplacer le joueur (renvoie true en cas de succès)
    //TODO:
    public boolean bougetJoueurVers(Direction direction){
        if(joueur.bougerVers(direction)){
            return true;
        }else{return false;}
    }

    //Permet de savoir si le joueur a gagné ou pas
    public boolean victoire(){
        int nb = 0;
         // On compare la position des caisses et des cibles, si elles sont égales on incrémente nb
 		for(Caisse cai: this.caisses){
 			for(Position poi:this.niveau.getCibles()){
 				if (cai.position.equals(poi)){nb++;}
 			}
 		}
    
         // Si cpt == le nombre de caisse total c'est gagné !
         if(nb==this.caisses.size()){
 			return true;
 		}
         // Sinon c'est perdu
 		return false;
 }
    }

    public String toString(){
        /* • Mur : #                                                            Un exemple de représentation :
        • Cible : .                                                             ######
        • Case : " "                                                                    #@$. #
        • Joueur : @, Joueur sur une cible : +                                          ######
        • Caisse : $, Caisse sur une cible : ∗
        */
    }

}
