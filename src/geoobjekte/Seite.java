package geoobjekte;

public class Seite {

    // Attribute
    // Assoziationen
    private Punkt a ;
    private Punkt b ;

    // Konstruktoren
    public Seite( Punkt a , Punkt b ) {
        this.a = a;
        this.b = b;
    }
    // getter / setter
    public Punkt getA() {
        return this.a;
    }
    public Punkt getB() {
        return this.b;
    }
    // Methoden
    public double laenge() {
        return laenge( a , b );
    }

    public static double laenge( Punkt pX , Punkt pY ) {
        double erg = 0;
        int xl = Math.abs(pX.getX() - pY.getX());
        int yl = Math.abs(pX.getY() - pY.getY());
        erg = Math.sqrt(Math.pow( xl , 2)
                + Math.pow( yl , 2));
        return erg;
    }

}
