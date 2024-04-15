public class Main {
    public static void main(String[] args) {
        int risultato = moltiplicazione(10, 5);
        int concat = concatenazione ( 5, 'ciao');
        System.out.println("il risultato della moltiplicazione è " + risultato);
    }

    public static int moltiplicazione (int a , int b){
        int c = a*b;
        return c;
    }

    public static int concatenazione ( int a,string b){
        int conc = a + b ;
        return conc;
    }



}