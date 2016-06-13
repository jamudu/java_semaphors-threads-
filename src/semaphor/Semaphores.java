//
package semaphor;

import java.util.concurrent.Semaphore;

/**
 *
 * @author usu21
 */
public class Semaphores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Semaphore semaph = new Semaphore(2, true);

        String nomVaix[] = {"A", "B", "C", "D", "E", "F"};

        Vaixell vaixells[] = new Vaixell[nomVaix.length];

        for (int i = 0; i < nomVaix.length; i++) {
            vaixells[i] = new Vaixell(semaph, nomVaix[i]);
            new Thread(vaixells[i]).start();
        }
    }
}
