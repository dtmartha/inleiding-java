package Hoofdstuk12;

/**
 * Created by gebruiker on 3-11-2016.
 */
import java.awt.*;
import java.applet.*;

public class Opdracht12_4 extends Applet {
    boolean gevonden;
    double[] salaris = { 100.0, 200.0, 500.0, 400.0, 300.0 };
    double gezocht;

    public void init() {
        gezocht = 400;
        gevonden = false;
        int teller = 0;

        /** for statement gebruikt**/

        for (int i = 0; i < salaris.length; i++) {
            if (salaris[i] == gezocht) {
                gevonden = true;
                teller++;

            }
        }
    }

    public void paint(Graphics g) {
        if(gevonden == true) {
            g.drawString("De waarde is gevonden.", 20, 50);
        }
        else {
            g.drawString("De waarde is niet gevonden.", 20, 50);
        }
    }
}
