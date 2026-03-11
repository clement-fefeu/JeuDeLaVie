package Components;

public class TestPerso extends Visiteur {
    
    public TestPerso(JeuDeLaVie jeu){
        super(jeu);
    }

    public void visiteCelluleVivante(Cellule c ){
        if(c.nombreVoisins(jeu)<1 || c.nombreVoisins(jeu)>7|| c.nombreVoisins(jeu)==4){
            jeu.ajouteCommande(new CommandeMeurt(c));
        }
    }

    public void visiteCelluleMorte(Cellule c ){
        if(c.nombreVoisins(jeu)>2 && c.nombreVoisins(jeu)<4){
            jeu.ajouteCommande(new CommandeVit(c));
        }

    }
}
