import java.util.ArrayList;

public class Niveau {
    private static Immobile[][] grille;          //composé d’objets Immobile, des murs sur tous les bords du niveau
    private static ArrayList<Position> cibles;   //là où les caisses doivent être déplacées

    public Niveau(int x, int y){
        // Creating X*Y Table
        grille = new Immobile[x][y];
    }

    // Permettent de connaître la taille du niveau
    public int getX(){return grille.length;} // Rows
    public int getY(){return grille[].length;}  //Columns

    // Ajoute un mur et renvoie true en cas de succès (pas de mur déjà posé)
    //TODO: Check it;
    public boolean addMur(Position pos){
        if (grille[pos.getX()][pos.getY()].getType() == Mur){
            return false;
        }else{
            grille[pos.getX()][pos.getY()] = new Mur();
        }
    }

    // Rajoute une cible (succès si la case n’est pas un mur ou ne contient pas déjà une cible) ;
    //TODO: Check it;
    public boolean addCible(Position pos){
        if (grille[pos.getX()][pos.getY()].getType() != Mur
                    && grille[pos.getX()][pos.getY()].getType() == null ){

            grille[pos.getX()][pos.getY()] = new Case();
            return true;

        }else{
            return false;
        }
    }

    // Teste si une cible se trouve à la Position passée en paramètre
    //TODO: Je pense qu'il faut mettre cette méthode static pour le utilisé dans configurations;
    public static boolean estCible(Position pos){
        for (int i=0; i<cibles.size(); i++){
            if (pos.equals(cibles.get(i))){return true;}
        }
        return false;
    }

    // Teste si la case ne contient pas de mur
    //TODO: Check it :: static in order to use in Configuration class !
    public static boolean estVide(Position pos){
        if (grille[pos.getX()][pos.getY()].getType() != Mur){
            return true;
        }else { return false;}
    }

    // Renvoie l’objet stocké à la position en paramètre dans le tableau grille
    public Element get(Position pos){
        return grille[pos.getX()][pos.getY()];
    }

}
