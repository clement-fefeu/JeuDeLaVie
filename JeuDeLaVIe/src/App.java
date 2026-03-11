import Components.DayNight;
import Components.FrameComponent;
import Components.HighLife;
import Components.JeuDeLaVie;
import Components.JeuDeLaVieUI;
import Components.TestPerso;
import Components.TestGen;
import Components.Texte;
import Components.VisiteurClassique;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

        FrameComponent frame=new FrameComponent();
        /* 
        JButton b= new JButton("test");
        
        frame.addComposant(b);
        */


        Scanner ask = new Scanner(System.in);

        System.out.println("Choisissez le type de visiteur : \n");
        System.out.println("pour le Basic , taper  : 0 \n");
        System.out.println("pour le Highlife, taper  : 1 \n");
        System.out.println("pour le Daynight, taper  : 2 \n");
        System.out.println("pour le Switch, taper  : 3 \n");
        System.out.println("pour la génération, taper  : 4 \n");

        int s=Integer.parseInt(ask.nextLine());

        JeuDeLaVie jeu=new JeuDeLaVie(100,100);
        JeuDeLaVieUI jeuUI=new JeuDeLaVieUI(jeu,frame);
        jeu.initGrille(jeuUI.getListCellule(),jeuUI);
        jeu.attacheObservateur(jeuUI);
        Texte t=new Texte(jeu);
        jeu.attacheObservateur(t);
        jeu.setUi(jeuUI);

        switch(s){
            case 0:
                VisiteurClassique v=new VisiteurClassique(jeu);
                jeu.setVisiteur(v);
                break;
            case 1:
                HighLife h=new HighLife(jeu);
                jeu.setVisiteur(h);
                break;
            case 2:
                DayNight d=new DayNight(jeu);
                jeu.setVisiteur(d);
                break;
            case 3:
                TestPerso tp=new TestPerso(jeu);
                jeu.setVisiteur(tp);
                break;
            case 4:
                TestGen tg= new TestGen(jeu);
                jeu.setVisiteur(tg);
                break;
        }

        ask.close();

        while(true){
            jeu.calculNextGen();
            jeuUI.paint();
            Thread.sleep(100);
        }

        
    }
}
