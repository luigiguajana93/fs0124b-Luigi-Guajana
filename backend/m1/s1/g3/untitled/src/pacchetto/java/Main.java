package pacchetto.java;

public class Main {

    public static void main(String[] args) {

            Rettangolo r = new Rettangolo(3,5);

            System.out.println("il perimetro del rettangolo è " + r.perimetroRettangolo());
            System.out.println("l'area del rettangolo è " + r.areaRettangolo());

             Rettangolo r1 = new Rettangolo(3,5);
             Rettangolo r2 = new Rettangolo(8,4);

        System.out.println("il perimetro del rettangolo 1 è " + r1.perimetroRettangolo());
        System.out.println("l'area del rettangolo 1 è " + r1.areaRettangolo());


        System.out.println("il perimetro del rettangolo 2 è " + r2.perimetroRettangolo());
        System.out.println("l'area del rettangolo 2 è " + r2.areaRettangolo());

        double sommaAree = Rettangolo.sommaAree(r1,r2);
        double sommaPerimetri= Rettangolo.sommaPerimetri(r1,r2);
        System.out.println("la somma delle aree è " + sommaAree);
        System.out.println("la somma dei perimetri è " + sommaPerimetri);


    }


}