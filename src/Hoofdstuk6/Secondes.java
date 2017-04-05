package Hoofdstuk6;

/**
 * Created by Niurca on 18-9-2016.
 */
/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

//importeer de benodigde klassen uit de Java bibliotheek

import java.applet.Applet;
import java.awt.*;

//een klasse met de naam Show van het type Applet
public class Secondes extends Applet {
    int minuut;
    int uur;
    int dag;
    int jaar;


    //een (lege) methode die de Applet initialiseert
    public void init() {
        minuut = 60;
        uur = minuut * 60;
        dag = uur * 24;
        jaar = dag * 365;


    }

    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.drawString("Hoeveel secondes zitten in :", 50, 40);
        g.drawString("in een uur : " + uur + " secondes", 50, 60);
        g.drawString("in een dag : " + dag + " secondes", 50, 80);
        g.drawString("in een jaar : " + jaar + " secondes", 50, 100);


    }

}