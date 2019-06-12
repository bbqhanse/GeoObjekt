package geoobjekte;

public abstract class GeoObjekt {

    private Punkt ursprungt;

    public GeoObjekt(Punkt ursprungt){this.ursprungt = ursprungt; }

    public Punkt getUrsprungt() {
        return ursprungt;
    }

    public void verschieben (Punkt wohin) {
        this.ursprungt = wohin;
    }

    public abstract double flaeche();
    public abstract double umfang();
}
