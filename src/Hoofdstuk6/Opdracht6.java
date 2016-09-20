package Hoofdstuk6;

/**
 * Created by Niurca on 16-9-2016.
 */

    /*

@(#)Opdracht6.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

//importeer de benodigde klassen uit de Java bibliotheek

import java.applet.Applet;
import java.awt.*;

//een klasse met de naam Opdracht6 van het type Applet
public class Opdracht6 extends Applet {
    int a, b;
    double uitkomst;


    //een (lege) methode die de Applet initialiseert
    public void init() {
        a = 113;
        b = 4;


        uitkomst = (a / b);


    }

    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 50, 60);

        g.drawString("Jan " + uitkomst, 50, 80);
        g.drawString("Ali " + uitkomst, 50, 100);
        g.drawString("Jeanette " + uitkomst, 50, 120);
        g.drawString("Dilion " + uitkomst, 50, 140);


    }

}








