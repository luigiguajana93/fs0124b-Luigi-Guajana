package pacchetto2.java;

public class Sim {

    private int numeroTelefono;
    private int credito;
    private Chiamata[] listaChiamate;

    public Sim (){
        numeroTelefono = 123456789;
        credito = 0;
        listaChiamate = new Chiamata[5];
    }

    public Sim (int numero){
        numeroTelefono=numero;
    }

    public void stampaDatiSim(){

        System.out.println("Numero di telefono " + numeroTelefono);
        System.out.println("Credito residuo " + credito + " euro");
        System.out.println("Ultime 5 chiamate: " );
        if(listaChiamate != null){
            for(int i = 0; i < listaChiamate.length; i++){
                System.out.println(listaChiamate[i]);
            }
        }
        else{ System.out.println("Nessuna chiamata effettuata");}

    }
}
