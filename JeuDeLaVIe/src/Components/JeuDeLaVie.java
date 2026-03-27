package Components;

import java.util.ArrayList;
import java.util.List;




public class JeuDeLaVie implements Observable{
    private Cellule [][] grille;
    private int xMax;
    private int yMax;
    private List<Commandes> commandes;
    Visiteur visiteur;
    List<Observateur> observateurs;
    public JeuDeLaVieUI ui;




    public JeuDeLaVie(int x,int y){

        this.setxMax(x);
        this.setyMax(y);
        this.observateurs=new ArrayList<Observateur>();
        this.grille=new Cellule[xMax][yMax];
        this.commandes=new ArrayList<>();
    }
        
        
        
    public void attacheObservateur(Observateur o){
        this.observateurs.add(o);
    }
    public void detacheObservateur(Observateur o){
        this.observateurs.remove(o);
    }
    public void notifieObservateur(){
        for(int i=0;i<this.observateurs.size();i++){
            observateurs.get(i).actualise();
        }
    } 
    public void distribueVisiteur(){
        for(int i=0;i<this.getyMax();i++){
            for(int j=0;j<this.getxMax();j++){
                this.getGrilleXY(j,i).accepte(visiteur);
            }
        }
    }
    
    
    public void calculNextGen(){
        this.distribueVisiteur();
        this.executeCommandes();
        this.notifieObservateur();
    }   


    public void initGrille(List<LieuCellule> l,JeuDeLaVieUI f){
        CelluleEtat x=null;
        for(int i=0;i<this.getyMax();i++){
            for(int j=0;j<this.getxMax();j++){

                if(Math.random()<0.1){
                    x=CelluleEtatVivant.INSTANCE;
                }else{
                    x=CelluleEtatMort.INSTANCE;
                }

                this.grille[i][j]=new Cellule(i,j,x);
                l.add(new LieuCellule(i*4, j*4, 4, 4,this.grille[i][j],f));
            }
        }
    }
    public Cellule getGrilleXY(int x,int y){
        return this.grille[x][y];
    }
    public void ajouteCommande(Commandes c){
        this.commandes.add(c);
    }
    public void executeCommandes(){
        for(int i=0;i<this.commandes.size();i++){
            this.getCommandes().get(i).executer();
        }
        this.commandes=new ArrayList<>();
    }

    /*
     * 
     * Setter et Getter
     * 
     * 
     */

    public Cellule[][] getGrille() {
        return grille;
    }
    public int getxMax() {
        return xMax;
    }
    public int getyMax() {
        return yMax;
    }
    public List<Commandes> getCommandes() {
        return commandes;
    }
    public JeuDeLaVieUI getUi() {
        return ui;
    }
    public void setGrille(Cellule[][] grille) {
        this.grille = grille;
    }
    public void setxMax(int xMax) {
        this.xMax = xMax;
    }
    public void setVisiteur(Visiteur visiteur) {
        this.visiteur = visiteur;
    }
    public void setyMax(int yMax) {
        this.yMax = yMax;
    }
    public void setUi(JeuDeLaVieUI ui) {
        this.ui = ui;
    }
}
