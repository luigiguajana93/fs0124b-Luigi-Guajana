package esercizio3;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {

        Map<String,Contatto> rubrica = new HashMap<>();
        rubrica.put("Mario", new Contatto("Mario","123456"));
        rubrica.put("Luigi", new Contatto("Luigi","654321"));
        rubrica.put("Giovanni", new Contatto("Giovanni","123456"));
        rubrica.put("Danilo", new Contatto("Danilo","147852"));
        rubrica.put("Simone", new Contatto("Simone","785465"));
        for (Contatto c :rubrica.values()){
            System.out.println(c);
        }
        rubrica.remove("Giovanni");
        System.out.println("ABBIAMO RIMOSSO UN UTENTE TRAMITE NOME");
        for (Contatto c : rubrica.values()){
            System.out.println(c);
        }
        System.out.println("ABBIAMO RIMOSSO UN UTENTE TRAMITE TELEFONO");





    }
}
