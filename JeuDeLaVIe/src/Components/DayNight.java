package Components;

public class DayNight extends Visiteur{
    
    public DayNight(JeuDeLaVie jeu){
        super(jeu);
    }

    public void visiteCelluleVivante(Cellule c ){
        if(c.nombreVoisins(jeu)<2 || c.nombreVoisins(jeu)==5){
            jeu.ajouteCommande(new CommandeMeurt(c));
        }
    }

    public void visiteCelluleMorte(Cellule c ){
        if(c.nombreVoisins(jeu)==3 || c.nombreVoisins(jeu)>6){
            jeu.ajouteCommande(new CommandeVit(c));
        }

    }
}