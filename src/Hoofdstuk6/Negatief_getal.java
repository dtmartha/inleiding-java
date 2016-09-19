package Hoofdstuk6;

/**
 * Created by Niurca on 18-9-2016.
 /*

 @(#)Show.java 1.0 03/02/26

  *

 Voorbeeld 2.1

 *

 */

//importeer de benodigde klassen uit de Java bibliotheek
import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet
public class Negatief_getal extends Applet {
    int a;
    int b;
    double uitkomst;

    //een (lege) methode die de Applet initialiseert
    public void init() {
        a = 2147483647;
        b = 2147483647;
        uitkomst = (a+b);



    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.drawString("negatief getal " + uitkomst ,50, 60 );

    }

}
