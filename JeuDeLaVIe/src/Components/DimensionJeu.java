package Components;

import java.awt.Component;
import javax.swing.JLabel;

public class DimensionJeu extends Component{
    
    JLabel indic;
    TexteChiffreUi xAxis;
    TexteChiffreUi yAxis;
    JeuDeLaVie jeu;

    public DimensionJeu(JeuDeLaVie j){
        super();
        this.jeu=j;
    }

    public void start(){
        this.jeu.start(this.xAxis.getNombre(),this.yAxis.getNombre());
    }
}
