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
public class Secondes extends Applet {
    int a, b, c,d, e;
    double uitkomst;
    int uitkomst1;
    double antwoord;




    //een (lege) methode die de Applet initialiseert
    public void init() {
        a = 60;
        b = 216000 ;
        c = 1440;
        d = 15778463;
        e = 2;


        uitkomst = (b/a);
        uitkomst1 = (d*e);
        antwoord = (c*a);


    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.drawString("in een uur " + uitkomst , 50, 60 );
        g.drawString("in een dag " + antwoord , 50, 80 );
        g.drawString("in een jaar " + uitkomst1 , 50, 100 );














    }

}