package Components;

public class Visiteur{
    
    JeuDeLaVie jeu;


    public Visiteur(JeuDeLaVie jeu){
        this.setJeu(jeu);
    }

    public void setJeu(JeuDeLaVie jeu) {
        this.jeu = jeu;
    }

    public void visiteCelluleVivante(Cellule c) {}

    public void visiteCelluleMorte(Cellule c) {}


}
