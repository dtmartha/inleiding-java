package Hoofdstuk12;

/**
 * Created by gebruiker on 1-11-2016.
 */

import java.awt.*;
import java.applet.*;

public class Opdracht12_1 extends Applet {
    double getallen[];
    double gemiddelde;

    public void init() {
        setSize(500, 400);
        getallen = new double[10];


        for (int teller = 0; teller < getallen.length; teller++) {
            getallen[teller] = 50 * teller + 100;

            gemiddelde +=  getallen[teller] / getallen.length;



        }
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < getallen.length; teller++) {
            g.drawString("" + getallen[teller], 50, 20 * teller + 20);
            g.drawString("Het gemiddelde is : " + gemiddelde, 200, 20);


        }
    }
}
