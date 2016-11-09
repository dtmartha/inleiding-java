package Hoofdstuk12;

/**
 * Created by gebruiker on 2-11-2016.
 */

import java.awt.*;
import java.applet.*;

public class Opdracht12_2 extends Applet {
    double getallen[];
    Button[] knop;

    public void init() {
        setSize(800, 400);
        knop = new Button[25];


        for (int teller = 0; teller < knop.length; teller++) {

            knop[teller] = new Button("knop " + (teller + 1));
            add(knop[teller]);
        }
    }
}





