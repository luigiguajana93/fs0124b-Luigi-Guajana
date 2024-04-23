package esercizio2;

import java.util.ArrayList;
import java.util.Random;

public class Program {

    private static ArrayList<Integer> generateList(int n){

        var lista = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            Random rand = new Random();
            int num = rand.nextInt(101);
            lista.add(num);

        }
    return lista;

    }


    private static ArrayList<Integer> listaDoppia(ArrayList<Integer> list){
        var lista=new ArrayList<Integer>();
        lista.addAll(list);
        lista.addAll(list.reversed());
        return lista;

    }

    private static void PariDispari (ArrayList<Integer> list, boolean b){

        if(b) {
            System.out.println("stampa numeri con indice pari");
            for (int i = 0; i < list.size(); i += 2) {
                System.out.println(list.get(i) + ",");
            }
        }
        else {
            System.out.println("stampa numeri con indice dispari");
            for (int i = 1; i < list.size(); i += 2) {
                System.out.println(list.get(i) + ",");
            }
        }
    }

    public static void main(String[] args) {

        var list =  generateList(10);


        System.out.println(list);
        System.out.println(listaDoppia(list));
        PariDispari(list,false);
    }
}
