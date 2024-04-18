package corso.java2;

import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        sceglinumero();
        stringToChar();
        countdown();


    }

    public static void sceglinumero() {


        String[] str = {"zero", "uno", "due", "tre"};
        System.out.print("inserisci un numero compreso tra 0 e 3:");


        int num = new Scanner(System.in).nextInt();
        switch (num) {
            case 0:
                System.out.println(str[0]);
                break;
            case 1:
                System.out.println(str[1]);
                break;
            case 2:
                System.out.println(str[2]);
                break;
            case 3:
                System.out.println(str[3]);
                break;
            default:
                throw new IllegalStateException("Invalid number : " + num);
        }
    }

    public static void stringToChar(){
        boolean end = false;
        String[] charString;
        while(!end){
        System.out.println("Scrivimi una frase o inserisci il comando :q");
        String str = new Scanner(System.in).next();
        if(str.equals(":q")){
            end =true;
            return;
        }
        else{
            charString= str.split("");
            System.out.println(Arrays.toString(charString));
        }
        }




    }


        public static void countdown(){
        System.out.print("inserisci il numero: ");
        int num = new Scanner(System.in).nextInt();
        for(int i = num;i>0; i--){
            System.out.println(i);
        }
        }





}
