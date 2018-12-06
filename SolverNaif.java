public class SolverNaif implements SolverInterface {

    private Configuration config;
    private int nbr_steps = 0;


    public SolverNaif(Configuration config){
        this.config = config;
    }

    public void set(Configuration config){
        this.config = config;
    }

    public Configuration getConfiguration(){
        return config;
    }

    public boolean stop(){
        if (config.victoire()){
            return true;
        }else{return false;}
    }

    public int getTotalSteps(){
        return nbr_steps;
    }
    
    public void step() {
    	
		int rand = (int)(Math.random()*4);
		
		nbr_steps++;
		
		switch(rand){
			case 0:
				this.config.bougerJoueurVers(Direction.HAUT);
				break;
			case 1:
				this.config.bougerJoueurVers(Direction.BAS);
				break;
			case 2:
				this.config.bougerJoueurVers(Direction.GAUCHE);
				break;
			default:
				this.config.bougerJoueurVers(Direction.DROITE);

		}
    
    }
}
