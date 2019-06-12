package geoobjekte;

public class GeoKreis extends GeoObjekt {

    // Attribute
    private int radius;

    // Assoziationen
    private Punkt mittelpunkt;

    // Konstruktor
    public GeoKreis( int radius , Punkt mittelpunkt ) {
        super( mittelpunkt );
        this.radius = radius;
        this.mittelpunkt = mittelpunkt;
    }
    public Punkt getMittelpunkt() {
        return this.mittelpunkt;
    }

    public double flaeche() {
        return radius * radius * Math.PI;
    }

    public double umfang() {
        return 2 * radius * Math.PI;
    }

}
