//
package semaphor;

import java.util.concurrent.Semaphore;

/**
 *
 * @author usu21
 */
public class Vaixell implements Runnable {

    private final Semaphore s;
    private final String nom;

    Vaixell(Semaphore s, String brand) {
        this.nom = brand;
        this.s = s;
    }

    @Override
    public void run() {
        try {
            s.acquire();
            System.out.println("Semafor per al vaixell: " + nom + " esta en verd!");
            Thread.sleep(2000);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            s.release();
        }
    }
}
