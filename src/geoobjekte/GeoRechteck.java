package geoobjekte;

public class GeoRechteck extends GeoObjekt {

    // Assoziationen
    private Seite s1;
    private Seite s2;

    // Konstruktor
    public GeoRechteck( Seite s1 , Seite s2) {
        super(s1.getA());
        this.s1 = s1;
        this.s2 = s2;
    }

    // getter / setter
    public Seite getS1() {
        return this.s1;
    }
    public Seite getS2() {
        return this.s2;
    }
    @Override
    public double flaeche() {
        return s1.laenge() * s2.laenge();
    }

    @Override
    public double umfang() {
        return 2 * (s1.laenge() + s2.laenge());
    }

}
