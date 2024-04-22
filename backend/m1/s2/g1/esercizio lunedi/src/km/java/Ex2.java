package km.java;

import java.util.Scanner;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Ex2 {
    private static final Logger logger = LoggerFactory.getLogger(Ex2.class);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kmPercorsi;
        double litriUsati;

        try {
            System.out.print("Inserisci il numero di km percorsi: ");
            kmPercorsi = scanner.nextDouble();

            System.out.print("Inserisci il numero di litri usati: ");
            litriUsati = scanner.nextDouble();

            double kmPerLitro = calcolaKmPerLitro(kmPercorsi, litriUsati);
            System.out.println("Km per litro: " + kmPerLitro);

        } catch (Exception e) {
            logger.error("Errore: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static double calcolaKmPerLitro(double km , double litri) throws ArithmeticException{
    if (litri == 0){
        throw new ArithmeticException("Il numero di litri usati non può essere 0");
        }
    return km/litri;

}
    }

