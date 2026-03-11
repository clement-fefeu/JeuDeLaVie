package Components;

public class CommandeMeurt extends Commandes {
    
    public CommandeMeurt(Cellule c){
        this.setCellule(c);
    }

    public void executer(){
        this.cellule.meurt();
    }

}
