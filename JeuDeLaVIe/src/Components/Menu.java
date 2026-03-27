package Components;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;


public class Menu extends Component{


    Visiteur v;
    int temps;
    JButton start;
    List<Component> composants;
    JeuDeLaVie jeu;

    /*
    start
    x button x est le nombre de mode 
    type box pour ecrire le timer
    */
    public Menu(JeuDeLaVie j){
        composants=new ArrayList<>();
        this.addVisiteur("VisiteurClassique",new VisiteurClassique(jeu));
        this.addVisiteur("High Life",new HighLife(jeu) );
        this.addVisiteur("DayNight",new DayNight(jeu) );
        this.addVisiteur("Choix du Dev",new TestGen(jeu) );
        this.addVisiteur("Epilepsie",new TestPerso(jeu));
        
   } 

   public void addVisiteur(String s,Visiteur v){
        JButton b=new JButton(s);

        this.composants.add(b);
   }
}
