import java.util.Scanner;


public class HeritageNotion {

    public static class FigureGeo {
    protected int x;
    protected int y;
        public FigureGeo(){
            x=0;
            y=0;
        }
        public FigureGeo(int nX, int nY){
            this.x = nX;
            this.y = nY;
        }
       /* public static void moveTo(int newX, int newY) {
            x = newX;
            y = newY;
        }
*/
    }

    public static class Carre extends FigureGeo {
    private long cote;
        public Carre(){
            //Ce mot clé appelle le constructeur de la classe mère
            super();
            cote = 0;
        }
        //Constructeur d'initialisation de capitale
        public Carre(int nnX, int nnY, long cote){
        super(nnX, nnY);
        this.cote = cote;
        }
        public long getCote() {
            return cote;
        }
        public long getPerimetre(){
            return 4*cote;
        }
          //Définit le mesure de cote
            public void setCote(long cote) {
            this.cote = cote;
            }

    }
    public static void main(String[] args){
        System.out.println("Yoh Man");
    
        FigureGeo figure = new FigureGeo(5, 5);
        //figure.moveTo(5, 5);
        Carre carre = new Carre(4, 5, 10);
        //carre.moveTo(3, 3);
        System.out.println(figure.x + " valeur de 1er cote et "+ figure.y + " valeur de 2e cote ");
        System.out.println(carre.x + " valeur de 1er cote et "+ carre.y + " valeur de 2e cote ");
    }
}