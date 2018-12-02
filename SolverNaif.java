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
}
