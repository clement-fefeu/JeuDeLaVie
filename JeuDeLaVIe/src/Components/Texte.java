package Components;

public class Texte implements Observateur{

    JeuDeLaVie jeu;
    int iteration;
    
    public Texte(JeuDeLaVie jeu){
        this.setJeu(jeu);
        this.iteration=0;
    }

    public int compteCellule(){
        int ret= 0;
        for(int i=0;i<jeu.getyMax();i++){
            for(int j=0;j<jeu.getxMax();j++){
                if(jeu.getGrilleXY(j, i).estVivant()){
                    ret++;
                }
            }
        }
        return ret;
    }

    public void actualise() {
        iteration++;
        int x=this.compteCellule();
        System.out.println("iteration numero " + this.iteration+ " avec " + x +" cellules en vie\n");
    }

    public void setJeu(JeuDeLaVie jeu) {
        this.jeu = jeu;
    }
        
}
