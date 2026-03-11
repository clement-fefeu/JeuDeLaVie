package Components;

public class LieuCellule{

    Cellule c;
    JeuDeLaVieUI j;
    int x;
    int y;
    int h;
    int w;

    public LieuCellule(int x, int y, int h,int w,Cellule c,JeuDeLaVieUI j){
        this.x=x;
        this.y=y;
        this.h=h;
        this.w=w;
        this.c=c;
        this.j=j;
    }
}
