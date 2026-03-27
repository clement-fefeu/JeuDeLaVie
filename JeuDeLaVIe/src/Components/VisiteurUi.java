package Components;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class VisiteurUi extends JButton implements MouseListener {

    JeuDeLaVie jeu;
    Visiteur vis;


    public VisiteurUi(JeuDeLaVie j,Visiteur v){
        super();
        this.jeu=j;
        this.vis=v;
        addMouseListener(this);
    }



    @Override
    public void mouseClicked(MouseEvent e) {
        this.jeu.setVisiteur(vis);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
