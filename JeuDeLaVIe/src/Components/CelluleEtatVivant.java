package Components;

public class CelluleEtatVivant implements CelluleEtat{
    
    public static CelluleEtat INSTANCE = new CelluleEtatVivant();

    private CelluleEtatVivant() {}

    public CelluleEtat vit(){
        return this;
    }
    public CelluleEtat meurt(){
        return CelluleEtatMort.INSTANCE;
    }
    public Boolean estVivant(){
        return Boolean.TRUE;
    }

    public void accepte(Visiteur v, Cellule c) {
       v.visiteCelluleVivante(c);
    }
}
