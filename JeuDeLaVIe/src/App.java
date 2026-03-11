import Components.DayNight;
import Components.HighLife;
import Components.JeuDeLaVie;
import Components.JeuDeLaVieUI;
import Components.Texte;
import Components.VisiteurClassique;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        JeuDeLaVie jeu=new JeuDeLaVie(50,50);
        JeuDeLaVieUI jeuUI=new JeuDeLaVieUI(jeu);
        jeu.initGrille(jeuUI.getListCellule(),jeuUI);
        jeu.attacheObservateur(jeuUI);
        Texte t=new Texte(jeu);
        jeu.attacheObservateur(t);
        jeu.setUi(jeuUI);

        Scanner ask = new Scanner(System.in);

        System.out.println("Choisissez le type de visiteur : \n");
        System.out.println("pour le Basic , taper  : 0 \n");
        System.out.println("pour le Highlife, taper  : 1 \n");
        System.out.println("pour le Daynight, taper  : 2 \n");

        int s=Integer.parseInt(ask.nextLine());

        switch(s){
            case 0:
                VisiteurClassique v=new VisiteurClassique(jeu);
                jeu.setVisiteur(v);
            case 1:
                HighLife h=new HighLife(jeu);
                jeu.setVisiteur(h);
            case 2:
                DayNight d=new DayNight(jeu);
                jeu.setVisiteur(d);
        }

        ask.close();

        while(true){
            jeu.calculNextGen();
            jeuUI.paint();
            Thread.sleep(100);
        }

        
    }
}
