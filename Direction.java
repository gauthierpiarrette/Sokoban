import java.util.ArrayList;

public class Direction {
    // une classe Direction qui permet de modéliser les actions possibles

    private final static Direction GAUCHE  = new Direction(-1, 0);   // (-1, 0)
    private final static Direction DROITE = new Direction(1, 0);   // (1, 0)
    private final static Direction HAUT = new Direction(0, -1);   // (0, -1)
    private final static Direction BAS = new Direction(0, 1);      // (0, 1)

    private ArrayList<Direction> DIRECTIONS;
    private int dx;
    private int dy;

    public Direction(int x, int y){
        DIRECTIONS.add(GAUCHE); DIRECTIONS.add(DROITE); DIRECTIONS.add(HAUT); DIRECTIONS.add(BAS);
        this.dx = x; this.dy = y;
    }

    //Besoin d'un dx, dy

    public int getDx() { return dx; }
    public int getDy() { return dy; }

    //Une méthode ArrayList<Direction> getDirections() qui permet de  renvoyer l’ensemble des directions
    // DIRECTIONS = [Gauche, DROITE, HAUT, BAS]
    public ArrayList<Direction> getDirections(){
        return DIRECTIONS;
    }
}
