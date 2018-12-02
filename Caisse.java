public class Caisse extends Mobile {
    public Caisse(Configuration config, Position pos){
        super(Type.CAISSE, config, pos);
    }

    public boolean bougerVers(Direction direction) {
        if (config.estVide(getPosition().add(direction))){
            setPosition(this.getPosition().add(direction));
        }else{
            return false;
        }
        return true;
    }
}
