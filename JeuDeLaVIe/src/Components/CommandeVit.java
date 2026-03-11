package Components;

public class CommandeVit extends Commandes{
    

    public CommandeVit(Cellule c){
        this.setCellule(c);
    }

    public void executer(){
        this.cellule.vit();
    }
}
