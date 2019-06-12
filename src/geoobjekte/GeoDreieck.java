package geoobjekte;

public class GeoDreieck extends GeoObjekt {

    // Assoziationen
    private Seite a;
    private Seite b;
    private Seite c;

    // Konstruktor
    public GeoDreieck( Seite a , Seite b , Seite c ) {
        super(a.getA());
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double umfang() {
        return a.laenge() + b.laenge() + c.laenge();
    }

    @Override
    public double flaeche() {
        // den schenken wir uns hier
        return Double.MIN_VALUE;
    }
}
