package Components;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

public class TempsUi extends JTextField implements KeyListener{

    String temps;

    public TempsUi(){
        super();
    }

    public int getTemps(){
        return Integer.parseInt(this.temps);
    }


    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyChar()>='0' || e.getKeyChar()<='9'){
            this.temps=this.temps+e.getKeyChar();
        }else{
            if(e.getKeyChar()==KeyEvent.VK_DELETE){
                this.temps=this.temps.substring(0,this.temps.length()-1);
            }else{
                
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
}
