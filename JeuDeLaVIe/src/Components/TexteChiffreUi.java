package Components;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

public class TexteChiffreUi extends JTextField implements KeyListener{

    JeuDeLaVie jeu;

    String nombre;

    public TexteChiffreUi(JeuDeLaVie j){
        super();
        this.jeu=j;
    }

    public int getNombre(){
        return Integer.parseInt(this.nombre);
    }


    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        char c=e.getKeyChar();
        if(c>='0' || c<='9'){
            this.nombre=this.nombre+c;
            this.setText(this.nombre+c);
        }else{
            if(c==KeyEvent.VK_DELETE){
                this.nombre=this.nombre.substring(0,this.nombre.length()-1);   
            }
            this.setText(this.nombre);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
}
