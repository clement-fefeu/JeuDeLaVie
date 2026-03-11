package Components;

public class VisiteurClassique extends Visiteur {
 
    public VisiteurClassique(JeuDeLaVie jeu) {
        super(jeu);
    }
    

    public void visiteCelluleVivante(Cellule c ){
        if(c.nombreVoisins(jeu)<2 || c.nombreVoisins(jeu)>3){
            jeu.ajouteCommande(new CommandeMeurt(c));
        }
    }

    public void visiteCelluleMorte(Cellule c ){
        if(c.nombreVoisins(jeu)==3){
            jeu.ajouteCommande(new CommandeVit(c));
        }
    }
}
