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
import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet
public class Praktijkopdracht extends Applet {
    double a, b, c, d, e;
    double uitkomst;
    int geheel;









    //een (lege) methode die de Applet initialiseert
    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;
        e = 10;
        geheel = 1;


        uitkomst = (a+b+c)/d*e;
        geheel = (int) uitkomst;
        uitkomst = geheel /e;







    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.drawString("gemiddelde " + uitkomst, 50, 60 );
    }

}