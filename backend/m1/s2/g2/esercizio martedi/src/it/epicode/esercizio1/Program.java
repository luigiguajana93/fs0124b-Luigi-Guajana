package it.epicode.esercizio1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("QUANTI ELEMENTI VUOI INSERIRE?: ");
        int n = scan.nextInt();
        scan.nextLine();

        var s = new HashSet<String>();
        var arrayDup = new ArrayList<String>();
        for(int i = 0; i < n; i++){
            System.out.println("quale parola vuoi inserire?");
            String parola = scan.nextLine();
            if(s.add(parola)){
                s.add(parola);
            }else{
            arrayDup.add(parola);}
        }
        System.out.println("ELENCO DELLE PAROLE DUPLICATE: " + arrayDup);
        System.out.println("NUMERO DI PAROLE DISTINTE: " + s.size());
        System.out.println("LISTA PAROLE DISTINTE: "+ s);
    }
}
