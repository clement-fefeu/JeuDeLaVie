package Components;

public class TestGen extends Visiteur{
    
    public TestGen(JeuDeLaVie jeu){
        super(jeu);
    }

    public void visiteCelluleVivante(Cellule c ){
        if(c.nombreVoisins(jeu)>8 || c.nombreVoisins(jeu)<0){
            jeu.ajouteCommande(new CommandeMeurt(c));
        }
    }

    public void visiteCelluleMorte(Cellule c ){
        if(c.nombreVoisins(jeu)>8){
            jeu.ajouteCommande(new CommandeVit(c));
        }

    }
}
