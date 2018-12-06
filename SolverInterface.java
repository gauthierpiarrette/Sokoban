public interface SolverInterface {
    public void set(Configuration config);

    public Configuration getConfiguration();

    public boolean stop();

    public int getTotalSteps();
    
    public void step();
}
