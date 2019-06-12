package geoobjekte;

public class GeoQuadrat extends GeoRechteck {

    //
    private Seite a;

    public GeoQuadrat(Seite s1) {
        super(s1,
                new Seite(s1.getB() ,
                        new Punkt(s1.getB().getY() ,
                                (int)s1.laenge() +
                                        s1.getB().getX())));
        this.a = s1;
    }

    public Seite getA() {
        return this.a;
    }

}
