
import Components.DayNight;
import Components.FrameComponent;
import Components.HighLife;
import Components.JeuDeLaVie;
import Components.JeuDeLaVieUI;
import java.util.Scanner;
import Components.TestGen;
import Components.TestPerso;
import Components.Texte;
import Components.VisiteurClassique;

import Components.Menu;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;


import javax.swing.JFrame;


public class App {
    public static void main(String[] args) throws Exception {

        /*
        FrameComponent frame=new FrameComponent();
        
        int xtemp=200;
        int ytemp=200;


        JeuDeLaVie jeu=new JeuDeLaVie();
        jeu.start(xtemp, ytemp);
        JeuDeLaVieUI jeuUI=new JeuDeLaVieUI(jeu);
        jeu.initGrille(jeuUI.getListCellule(),jeuUI);
        jeu.attacheObservateur(jeuUI);
        Texte t=new Texte(jeu);
        jeu.attacheObservateur(t);
        jeu.setUi(jeuUI);

        System.out.println("Choisissez le type de visiteur : \n");
        System.out.println("pour le Basic , taper  : 0 \n");
        System.out.println("pour le Highlife, taper  : 1 \n");
        System.out.println("pour le Daynight, taper  : 2 \n");
        System.out.println("pour le Perso, taper  : 3 \n");
        System.out.println("pour la génération, taper  : 4 \n");

        Scanner ask = new Scanner(System.in);
        int s=Integer.parseInt(ask.nextLine());

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
        
        */
        
        JFrame j=new JFrame();
        j=new JFrame();
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(Boolean.TRUE);
        Dimension d =Toolkit.getDefaultToolkit().getScreenSize();
        j.setSize(d) ;
        Menu men=new Menu(null);
        for(Component c:men.composants()){
            j.add(c);
        }


        /*
        jeuUI.setWindow(j, frame);

        while(true){
            jeu.calculNextGen();
            jeuUI.paint();
            Thread.sleep(jeu.getTemps());
        }
        */
        
    }
}
