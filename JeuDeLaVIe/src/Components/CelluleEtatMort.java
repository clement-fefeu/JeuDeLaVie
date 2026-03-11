package Components;

public class CelluleEtatMort implements CelluleEtat{
    public static CelluleEtat INSTANCE = new CelluleEtatMort();

    private CelluleEtatMort() {}

    public CelluleEtat vit(){
        return CelluleEtatVivant.INSTANCE;
    }
    public CelluleEtat meurt(){
        return this;
    }
    public Boolean estVivant(){
        return Boolean.FALSE;
    }


    public void accepte(Visiteur v, Cellule c) {
        v.visiteCelluleMorte(c);
    }
}
