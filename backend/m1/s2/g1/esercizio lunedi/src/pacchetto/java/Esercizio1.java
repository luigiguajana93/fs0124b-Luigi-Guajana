package pacchetto.java;

import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {

    private int[] array = new int[5];

    public Esercizio1(){
        for (int i =0 ; i < array.length ; i++){
             array[i]=new Random().nextInt(11);

        }
        System.out.println("Numeri array:");
        for(int i = 0;i < array.length ; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public void stampamiArray(){
        for(int i = 0;i < array.length ; i++){
            System.out.print(array[i] + "");
        }
    }
    public void example(){
        Scanner scanner = new Scanner(System.in);
        int numero;
        int posizione;
        boolean check = true;
        do{
            System.out.println("inserisci un nuovo numero:");
            numero = scanner.nextInt();
            if(numero != 0) {
                scanner.nextLine();
                System.out.println("in che posizione?");
                posizione = scanner.nextInt();
                scanner.nextLine();
                array[posizione-1] = numero;
            }else check= false;
        }while (check);
    }
}
