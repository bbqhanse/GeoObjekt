package geoobjekte;

public class Test {

    public static void main(String[] args) {

        Punkt a = new Punkt( 2 , 1 );
        Punkt b = new Punkt( 4 , 3 );
        Punkt kr = new Punkt( 5 , 5 );

        GeoKreis rund1 = new GeoKreis( 3 , kr );

        Seite eins = new Seite( a , b );
        System.out.println(eins.laenge());

        System.out.println("Statische Methode laenge()");
        System.out.println(Seite.laenge( a , kr ));

        System.out.println("Der Kreisumfang ist "
                + rund1.umfang());
        System.out.println("Die Kreisfläche ist "
                + rund1.flaeche());

        // geht nicht:
        //GeoObjekt neu = new GeoObjekt(a);
        System.out.println("\nDas Dreieck:");
        Punkt dr1 = new Punkt (0 , 5);
        Punkt dr2 = new Punkt (5 , 5);
        Punkt dr3 = new Punkt (5 , 0);

        Seite s1 = new Seite (dr1 , dr2);
        Seite s2 = new Seite (dr2 , dr3);
        Seite s3 = new Seite (dr3 , dr1);

        GeoDreieck dr = new GeoDreieck(s1 , s2 , s3);
        System.out.println(dr.umfang());
        System.out.println(dr.flaeche());

        System.out.println("\n\nDas Rechteck:");
        Punkt re1 = new Punkt (1 , 1);
        Punkt re2 = new Punkt (1 , 6);
        Punkt re3 = new Punkt (4 , 6);
        Seite res1 = new Seite (re1 , re2); // 5
        Seite res2 = new Seite (re2 , re3); // 3
        GeoRechteck rechteck =
                new GeoRechteck(res1, res2);
        System.out.println("Umfang = " + rechteck.umfang());
        System.out.println("Fläche = " + rechteck.flaeche());

        System.out.println("\n\nDas Quadrat: ");
        Punkt q1 = new Punkt( 2 , 2);
        Punkt q2 = new Punkt( 2 , 5);
        Seite qs = new Seite(q1 , q2);
        GeoQuadrat gq = new GeoQuadrat(qs);
        System.out.println("Umfang: " + gq.umfang());
        System.out.println("Fläche: " + gq.flaeche());

        System.out.println("Umfang des Quadrats: "
                + gq.umfang());

    }

}
