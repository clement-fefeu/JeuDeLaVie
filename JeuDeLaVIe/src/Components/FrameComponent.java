package Components;


import java.awt.Container;
import java.util.ArrayList;

public class FrameComponent {
        private ArrayList<Container> composant;

        public FrameComponent(){
            this.composant=new ArrayList<>();
        }

        /*
         * 
         * getter setter adder 
         * 
         */

        public ArrayList<Container> getComposant() {
            return composant;
        }
        public void setComposant(ArrayList<Container> composant) {
            this.composant = composant;
        }
        public void addComposant(Container c){
            this.composant.add(c);
        }
}
