package Components;

public interface CelluleEtat{


    public CelluleEtat vit();

    public CelluleEtat meurt();
    
    public Boolean estVivant();

    public void accepte(Visiteur v,Cellule c);
}