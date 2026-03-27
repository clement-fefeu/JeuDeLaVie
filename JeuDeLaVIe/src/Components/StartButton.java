package Components;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;

public class StartButton {

    JButton but;
    DimensionJeu dim;
    Temps tem;


    public StartButton(JeuDeLaVie j){
        this.but=new JButton("Commencer");
        this.but.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                tem.start();
                dim.start();
            }
        });
        this.dim=new DimensionJeu(j);
        this.tem=new Temps(j);

        Dimension d =Toolkit.getDefaultToolkit().getScreenSize();
        this.but.setBounds(0,0,d.width/2,d.height/2);
        this.dim.xAxis.setBounds(0,d.height/2,d.width/2,d.height/2);
        this.dim.yAxis.setBounds(d.width/2,0,d.width/2,d.height/2);
        this.tem.setBounds(d.width/2,d.height/2,d.width/2,d.height/2);

    }

    public void ajouteFrame(ArrayList<Component> ret){
        ret.add(this.but);
        ret.add(dim);
        ret.add(tem);
    }


    /*
    *
    * Setter Getter
    * 
    */

    public void setDim(DimensionJeu dim) {
        this.dim = dim;
    }
    public void setTem(Temps tem) {
        this.tem = tem;
    }


    public DimensionJeu getDim() {
        return dim;
    }
    public Temps getTem() {
        return tem;
    }
    
}
