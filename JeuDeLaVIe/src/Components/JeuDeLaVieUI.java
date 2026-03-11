package Components;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;


import javax.swing.JFrame;



public class JeuDeLaVieUI extends JFrame implements Observateur, MouseListener{
    
    JeuDeLaVie jeu;
    List<LieuCellule>  listCellule;
    Graphics g;
    JFrame f;

    
        public JeuDeLaVieUI(JeuDeLaVie jeu,FrameComponent ajoutFrame){


            addMouseListener(this);
            this.setJeu(jeu);
            this.listCellule=new ArrayList<>();
            this.f=new JFrame();
            this.f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.f.setVisible(Boolean.TRUE);
            this.f.setSize(new Dimension(1000,1000));
            for(Container c : ajoutFrame.getComposant()){
                this.f.add(c);
            }
            this.g=f.getGraphics();
            

    }



    public void actualise(){
        repaint();
    }

    public void color(LieuCellule l,Color c){
        this.g.setColor(c);
        this.g.fillRect(l.x,l.y,3,3);
    }

    public void paint(){
        super.paint(this.g);
        g.clearRect(0, 0,1,1);

        for(int t=0;t<this.listCellule.size();t++){
            if(this.listCellule.get(t).c.estVivant()){
                this.color(this.listCellule.get(t),Color.BLACK);
            }else{
                this.color(this.listCellule.get(t),Color.WHITE);
            }
        }
    }




    public void setJeu(JeuDeLaVie jeu) {
        this.jeu = jeu;
    }
    public JeuDeLaVie getJeu() {
        return jeu;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        /*int x=e.getX();
        int y=e.getY();
        System.out.println("\nposition : "+x +" , "+y);
        int x1;
        int y1;
        int x2;
        int y2;
        for(int i=0;i<this.listCellule.size();i++) {
            x1=this.listCellule.get(i).x;
            y1=this.listCellule.get(i).y;
            x2=this.listCellule.get(i).x+this.listCellule.get(i).w;
            y2=this.listCellule.get(i).y+this.listCellule.get(i).h;
            if(x>x1 && x<x2){
                if(y>y1 && y<y2){
                    if(this.listCellule.get(i).c.estVivant()){
                        this.listCellule.get(i).c.vit();
                        this.color(listCellule.get(i),Color.WHITE);
                    }else{
                        this.listCellule.get(i).c.meurt();
                        this.color(listCellule.get(i),Color.BLACK);
                    }
                }
            }
        }/* */
        System.out.println("click\n");
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        this.f.setBackground(Color.GREEN);
    }
    @Override
    public void mouseExited(MouseEvent e) {
        this.f.setBackground(Color.WHITE);
    }
    @Override
    public void mousePressed(MouseEvent e) {
    }
    @Override
    public void mouseReleased(MouseEvent e) {
    }

    /*
    *
    * Getter et Setter
    * 
    */

    public List<LieuCellule> getListCellule() {
        return listCellule;
    }
}
