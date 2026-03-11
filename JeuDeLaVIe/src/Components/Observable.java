package Components;


public interface Observable {
    
    public void attacheObservateur(Observateur o);

    public void detacheObservateur(Observateur o);
    
    public void notifieObservateur(); 
}
