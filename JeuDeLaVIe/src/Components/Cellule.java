package Components;

public class Cellule {
    private CelluleEtat celluleEtat;
    private int x;
    private int y;
    
    public Cellule(int x,int y,CelluleEtat base){
        this.setCelluleEtat(base);
        this.setX(x);
        this.setY(y);
    }



    public int nombreVoisins(JeuDeLaVie jeu){
        int ret=0;
        if(this.getX()==0){
            if(this.getY()==0){
                if(jeu.getGrilleXY(0,1).estVivant()){
                    ret++;
                }
                if(jeu.getGrilleXY(1,0).estVivant()){
                    ret++;
                }
                if(jeu.getGrilleXY(1,1).estVivant()){
                    ret++;
                }
            }else if(this.getY()+1==jeu.getyMax()){
                if(jeu.getGrilleXY(1,this.getY()).estVivant()){
                    ret++;
                }
                if(jeu.getGrilleXY(0,this.getY()-1).estVivant()){
                    ret++;
                }
                if(jeu.getGrilleXY(1,this.getY()-1).estVivant()){
                    ret++;
                }
            }else{
                if(jeu.getGrilleXY(0,this.getY()-1).estVivant()){
                    ret++;
                }
                if(jeu.getGrilleXY(0,this.getY()+1).estVivant()){// here
                    ret++;
                }
                if(jeu.getGrilleXY(1,this.getY()-1).estVivant()){
                    ret++;
                }
                if(jeu.getGrilleXY(1,this.getY()).estVivant()){
                    ret++;
                }
                if(jeu.getGrilleXY(1,this.getY()+1).estVivant()){ // here
                    ret++;
                }
            }
        }else if(this.getX()+1==jeu.getxMax()){
            if(this.getY()==0){
                if(jeu.getGrilleXY(this.getX(),1).estVivant()){
                    ret++;
                }
                if(jeu.getGrilleXY(this.getX()-1,0).estVivant()){
                    ret++;
                }
                if(jeu.getGrilleXY(this.getX()-1,1).estVivant()){
                    ret++;
                }
            }else if(this.getY()+1==jeu.getyMax()){
                if(jeu.getGrilleXY(this.getX()-1,this.getY()-1).estVivant()){
                    ret++;
                }
                if(jeu.getGrilleXY(this.getX(),this.getY()-1).estVivant()){
                    ret++;
                }
                if(jeu.getGrilleXY(this.getX()-1,this.getY()).estVivant()){
                    ret++;
                }
            }else{
                if(jeu.getGrilleXY(this.getX()-1,this.getY()-1).estVivant()){
                    ret++;
                }
                if(jeu.getGrilleXY(this.getX()-1,this.getY()).estVivant()){
                    ret++;
                }
                if(jeu.getGrilleXY(this.getX()-1,this.getY()+1).estVivant()){
                    ret++;
                }
                if(jeu.getGrilleXY(this.getX(),this.getY()-1).estVivant()){
                    ret++;
                }
                if(jeu.getGrilleXY(this.getX(),this.getY()+1).estVivant()){
                    ret++;
                }
            }
        }else{
            if(this.getY()==0){
                if(jeu.getGrilleXY(this.getX()-1,0).estVivant()){
                    ret++;
                }
                if(jeu.getGrilleXY(this.getX()+1,0).estVivant()){
                    ret++;
                }
                if(jeu.getGrilleXY(this.getX()-1,1).estVivant()){
                    ret++;
                }
                if(jeu.getGrilleXY(this.getX(),1).estVivant()){
                    ret++;
                }
                if(jeu.getGrilleXY(this.getX()+1,1).estVivant()){
                    ret++;
                }
            }else if(this.getY()+1==jeu.getyMax()){
                if(jeu.getGrilleXY(this.getX()-1,this.getY()-1).estVivant()){
                    ret++;
                }
                if(jeu.getGrilleXY(this.getX(),this.getY()-1).estVivant()){
                    ret++;
                }
                if(jeu.getGrilleXY(this.getX()+1,this.getY()-1).estVivant()){
                    ret++;
                }
                if(jeu.getGrilleXY(this.getX()-1,this.getY()).estVivant()){
                    ret++;
                }
                if(jeu.getGrilleXY(this.getX()+1,this.getY()).estVivant()){
                    ret++;
                }
            }else{
                if(jeu.getGrilleXY(this.getX()-1,this.getY()-1).estVivant()){
                    ret++;
                }
                if(jeu.getGrilleXY(this.getX()-1,this.getY()).estVivant()){
                    ret++;
                }
                if(jeu.getGrilleXY(this.getX()-1,this.getY()+1).estVivant()){
                    ret++;
                }
                if(jeu.getGrilleXY(this.getX(),this.getY()-1).estVivant()){
                    ret++;
                }
                if(jeu.getGrilleXY(this.getX(),this.getY()+1).estVivant()){
                    ret++;
                }
                if(jeu.getGrilleXY(this.getX()+1,this.getY()-1).estVivant()){
                    ret++;
                }
                if(jeu.getGrilleXY(this.getX()+1,this.getY()).estVivant()){
                    ret++;
                }
                if(jeu.getGrilleXY(this.getX()+1,this.getY()+1).estVivant()){
                    ret++;
                }
            }
        }
        return ret;
    }


    public void vit(){
        celluleEtat=(celluleEtat.vit());
    }
    public void meurt(){
        celluleEtat=(celluleEtat.meurt());
    }

    public Boolean estVivant(){
        return this.getCelluleEtat().estVivant();
    }


    public void accepte(Visiteur v){
        this.getCelluleEtat().accepte(v, this);
    }

    /*
     * 
     * Setter et Getter
     * 
     * 
     */



    public void setCelluleEtat(CelluleEtat celluleEtat) {
        this.celluleEtat = celluleEtat;
    }public void setX(int x) {
        this.x = x;
    }public void setY(int y) {
        this.y = y;
    }


    public CelluleEtat getCelluleEtat() {
        return celluleEtat;
    }public int getX() {
        return x;
    }public int getY() {
        return y;
    }
}
