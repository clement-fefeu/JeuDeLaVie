package Components;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;


public class Menu extends Component{


     Visiteur v;
     int temps;
     StartButton start;
     List<Component> composants;
     Temps tem;

     /*
     start
     x button x est le nombre de mode 
     type box pour ecrire le timer
     */
     public Menu(JeuDeLaVie j){
          
          composants=new ArrayList<>();
          this.start=new StartButton(j);
          this.addVisiteur("VisiteurClassique",new VisiteurClassique(j));
          this.addVisiteur("High Life",new HighLife(j) );
          this.addVisiteur("DayNight",new DayNight(j) );
          this.addVisiteur("Choix du Dev",new TestGen(j) );
          this.addVisiteur("Epilepsie",new TestPerso(j));
        
        
     } 

     public void addVisiteur(String s,Visiteur v){
          Dimension d =Toolkit.getDefaultToolkit().getScreenSize();
          JButton b=new JButton(s);
          b.setBounds(0,0, d.width/2, d.height/2);
          this.composants.add(b);
     }

     public ArrayList<Component> composants(){
          ArrayList<Component> ret = new ArrayList<>();
          this.start.ajouteFrame(ret);
          for(Component c:this.composants){
               ret.add(c);
          }
          


          
          return ret;
     }
}
