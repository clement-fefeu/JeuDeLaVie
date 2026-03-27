package Components;

public class Temps extends TexteChiffreUi {
    
    public Temps(JeuDeLaVie j){
        super(j);
    }

    public void start(){
        this.jeu.setTemps(this.getNombre());
    }
}
